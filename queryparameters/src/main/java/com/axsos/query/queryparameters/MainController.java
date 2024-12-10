package com.axsos.query.queryparameters;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "q", required = false) String searchQuery) {
        if (searchQuery == null || searchQuery.isEmpty()) {
            return "You did not provide a search query.";
        }
        return "You searched for: " + searchQuery;
    }
}
