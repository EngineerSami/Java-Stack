package com.axsosacademy.mvc.controllers;

import com.axsosacademy.mvc.models.Burger;
import com.axsosacademy.mvc.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/burgers")
public class BurgerController {
    private final BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping
    public String burgers(Model model) {
        List<Burger> burgers = burgerService.getAllBurgers();
        model.addAttribute("burgers", burgers);
        model.addAttribute("burger", new Burger()); 
        return "burgers"; 
    }

    @GetMapping("/{id}")
    public String show(Model model, @PathVariable Long id) {
        Burger burger = burgerService.findBurger(id);
        if (burger == null) {
            return "redirect:/burgers"; 
        }
        model.addAttribute("burger", burger);
        return "show"; 
    }

    @GetMapping("/new")
    public String newBurger(Model model) {
        model.addAttribute("burger", new Burger());
        return "new"; 
    }


    @PostMapping
    public String createNewBurger(@Valid @ModelAttribute Burger burger, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {

            List<Burger> burgers = burgerService.getAllBurgers();
            model.addAttribute("burgers", burgers);
            return "burgers"; 
        } else {
            burgerService.createBurger(burger);
            return "redirect:/burgers"; 
        }
    }

    @GetMapping("/edit/{id}")
    public String editBurger(@PathVariable Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        if (burger == null) {
            return "redirect:/burgers"; 
        }
        model.addAttribute("burger", burger);
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateBurger(@PathVariable Long id, @Valid @ModelAttribute Burger burger, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit"; 
        }
        burgerService.updateBurger(id, burger.getBurgerName(), burger.getRestaurantName(), burger.getRating(), burger.getDescription());
        return "redirect:/burgers";
    }

    @PostMapping("/delete/{id}")
    public String deleteBurger(@PathVariable Long id) {
        burgerService.deleteBurger(id);
        return "redirect:/burgers";
    }
}