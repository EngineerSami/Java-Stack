package com.axsos.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

    private static final String VISIT_COUNT = "visitCount";

    @GetMapping("/")
    public String incrementCounter(HttpSession session) {
        Integer count = (Integer) session.getAttribute(VISIT_COUNT);
        if (count == null) {
            count = 0;
        }
        session.setAttribute(VISIT_COUNT, ++count);
        return "increment";
    }

    @GetMapping("/counter")
    public String getCounter(HttpSession session, Model model) {
        Integer count = (Integer) session.getAttribute(VISIT_COUNT);
        if (count == null) {
            count = 0; // Default to zero if no visits have occurred
        }
        model.addAttribute("visitCount", count);
        return "counter"; 
    }
}
