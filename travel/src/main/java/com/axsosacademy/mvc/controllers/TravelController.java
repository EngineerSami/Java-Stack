package com.axsosacademy.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsosacademy.mvc.models.Travel;
import com.axsosacademy.mvc.services.TravelService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/Travels")
public class TravelController {
    private final TravelService TravelService;

    public TravelController(TravelService TravelService) {
        this.TravelService = TravelService;
    }

    @GetMapping
    public String Travels(Model model) {
        List<Travel> Travels = TravelService.getAllTravels();
        model.addAttribute("Travels", Travels);
        model.addAttribute("Travel", new Travel()); 
        return "Travels"; 
    }

    @GetMapping("/{id}")
    public String show(Model model, @PathVariable Long id) {
        Travel Travel = TravelService.findTravel(id);
        if (Travel == null) {
            return "redirect:/Travels"; 
        }
        model.addAttribute("Travel", Travel);
        return "show"; 
    }

    @GetMapping("/new")
    public String newTravel(Model model) {
        model.addAttribute("Travel", new Travel());
        return "new"; 
    }


    @PostMapping
    public String createNewTravel(@Valid @ModelAttribute Travel Travel, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {

            List<Travel> Travels = TravelService.getAllTravels();
            model.addAttribute("Travels", Travels);
            return "Travels"; 
        } else {
            TravelService.createTravel(Travel);
            return "redirect:/Travels"; 
        }
    }

    @GetMapping("/edit/{id}")
    public String editTravel(@PathVariable Long id, Model model) {
        Travel Travel = TravelService.findTravel(id);
        if (Travel == null) {
            return "redirect:/Travels"; 
        }
        model.addAttribute("Travel", Travel);
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateTravel(@PathVariable Long id, @Valid @ModelAttribute Travel Travel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit"; 
        }
        TravelService.updateTravel(id, Travel.getexpenseName(), Travel.getvendor(), Travel.getamount(), Travel.getDescription());
        return "redirect:/Travels";
    }
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        TravelService.deleteTravel(id);
        return "redirect:/Travels";
    }
}