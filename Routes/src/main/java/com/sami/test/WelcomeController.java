package com.sami.test;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class WelcomeController {

    
    @GetMapping("/")
    public String index() {
        return "/daikichi | /daikichi/today | /daikichi/tomorrow";
    }
    @GetMapping("/daikichi")
    public String daikichi() {
        return "Welcome!";
    }

    @GetMapping("/daikichi/today")
    public String today() {
        return "Today you will find luck in all your endeavors";
    }

    @GetMapping("/daikichi/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

}
