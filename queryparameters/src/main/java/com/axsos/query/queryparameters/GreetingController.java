package com.axsos.query.queryparameters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greet(@RequestParam(defaultValue = "human") String name) {
        return "Hello, " + name + "!";
    }
    
}
