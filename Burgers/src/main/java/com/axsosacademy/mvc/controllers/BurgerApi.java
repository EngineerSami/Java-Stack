package com.axsosacademy.mvc.controllers;

import com.axsosacademy.mvc.models.Burger;
import com.axsosacademy.mvc.services.BurgerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/burgers") 
public class BurgerApi {
    private final BurgerService burgerService;

    public BurgerApi(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping
    public List<Burger> index() {
        return burgerService.getAllBurgers();
    }

    @PostMapping
    public Burger create(
            @RequestParam(value = "burgerName") String burgerName,
            @RequestParam(value = "restaurantName") String restaurantName,
            @RequestParam(value = "rating") Double rating,
            @RequestParam(value = "description") String description 
    ) {
        Burger burger = new Burger(burgerName, restaurantName, rating, description);
        return burgerService.createBurger(burger);
    }

    @GetMapping("/{id}")
    public Burger show(@PathVariable("id") Long id) {
        return burgerService.findBurger(id);
    }

    @PutMapping("/{id}")
    public Burger update(
            @PathVariable("id") Long id,
            @RequestParam(value = "burgerName") String burgerName,
            @RequestParam(value = "restaurantName") String restaurantName,
            @RequestParam(value = "rating") Double rating,
            @RequestParam(value = "description") String description 
    ) {
        Burger updatedBurger = new Burger(burgerName, restaurantName, rating, description);
        updatedBurger.getId(id); 
        return burgerService.updateBurger(updatedBurger);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        burgerService.deleteBurger(id);
    }
}