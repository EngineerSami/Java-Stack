package com.axsos.dojoandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.services.DojoService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private DojoService dojoService;

    @GetMapping("/")
    public String index(Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos); 
        return "index"; 
    }
}