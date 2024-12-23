package com.axsos.dojoandninjas.controllers;

import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.services.DojoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/dojos")
public class DojoController {

    @Autowired
    private DojoService dojoService;

    @GetMapping("/create")
    public String showCreateDojoForm(Model model) {
        return "createDojo"; 
    }

    @PostMapping
    public String createDojo(@ModelAttribute Dojo dojo) {
        dojoService.createDojo(dojo); 
        return "redirect:/"; 
    }

    @GetMapping("/{id}")
    public String getDojoById(@PathVariable Long id, Model model) {
        Dojo dojo = dojoService.getDojoById(id);
        if (dojo == null) {
            return "redirect:/"; 
        }
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", dojoService.getNinjas(id)); 
        return "dojoDetails";
    }

    // List all Dojos
    @GetMapping
    public String listDojos(Model model) {
        List<Dojo> dojos = dojoService.getAllDojos(); 
        model.addAttribute("dojos", dojos); 
        return "index"; 
    }
}