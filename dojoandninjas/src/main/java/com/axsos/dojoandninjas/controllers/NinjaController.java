package com.axsos.dojoandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.services.DojoService;
import com.axsos.dojoandninjas.services.NinjaService;

import java.util.List;

@Controller
@RequestMapping("/api/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @Autowired
    private DojoService dojoService;

    @GetMapping("/create")
    public String showCreateNinjaForm(Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "createNinja"; 
    }

    @PostMapping
    public String createNinja(@ModelAttribute Ninja ninja, @RequestParam Long dojoId) {
        Dojo dojo = dojoService.getDojoById(dojoId); 
        ninja.setDojo(dojo); 
        ninjaService.createNinja(ninja); 
        return "redirect:/"; 
    }
}