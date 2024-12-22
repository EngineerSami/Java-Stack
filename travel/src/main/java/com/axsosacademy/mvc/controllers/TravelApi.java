package com.axsosacademy.mvc.controllers;

import com.axsosacademy.mvc.models.Travel;
import com.axsosacademy.mvc.services.TravelService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/Travels") 
public class TravelApi {
    private final TravelService TravelService;

    public TravelApi(TravelService TravelService) {
        this.TravelService = TravelService;
    }

    @GetMapping
    public List<Travel> index() {
        return TravelService.getAllTravels();
    }

    @PostMapping
    public Travel create(
            @RequestParam(value = "expenseName") String expenseName,
            @RequestParam(value = "vendor") String vendor,
            @RequestParam(value = "amount") Double amount,
            @RequestParam(value = "description") String description 
    ) {
        Travel Travel = new Travel(expenseName, vendor, amount, description);
        return TravelService.createTravel(Travel);
    }

    @GetMapping("/{id}")
     public String showTravel(@PathVariable Long id, Model model) {
        Travel Travel = TravelService.findTravel(id);
        model.addAttribute("Travel", Travel);
        return "show"; 
    }
    

    @RequestMapping("/{id}")
    public Travel update(
            @PathVariable("id") Long id,
            @RequestParam(value = "expenseName") String expenseName,
            @RequestParam(value = "vendor") String vendor,
            @RequestParam(value = "amount") Double amount,
            @RequestParam(value = "description") String description 
    ) {
        Travel updatedTravel = new Travel(expenseName, vendor, amount, description);
        updatedTravel.getId(id); 
        return TravelService.updateTravel(updatedTravel);
    }

 
}