package com.axsos.gold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class NinjaGoldController {

    @GetMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        return "index"; 
    }

    @PostMapping("/process_gold")
    public String processGold(@RequestParam("building") String building, HttpSession session) {
        Random random = new Random();
        int goldEarned = 0;
        String message;

        switch (building) {
            case "farm":
                goldEarned = random.nextInt(11) + 10; 
                message = "You entered a farm and earned " + goldEarned + " gold.";
                break;
            case "cave":
                goldEarned = random.nextInt(6) + 5;
                message = "You entered a cave and earned " + goldEarned + " gold.";
                break;
            case "house":
                goldEarned = random.nextInt(4) + 2; 
                message = "You entered a house and earned " + goldEarned + " gold.";
                break;
            case "quest":
                goldEarned = random.nextInt(101) - 50; 
                if (goldEarned >= 0) {
                    message = "You completed a quest and earned " + goldEarned + " gold.";
                } else {
                    message = "You failed a quest and lost " + Math.abs(goldEarned) + " gold. Ouch!";
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid building type");
        }

        int currentGold = (int) session.getAttribute("gold");
        session.setAttribute("gold", currentGold + goldEarned);

        @SuppressWarnings("unchecked")
        List<String> activities = (List<String>) session.getAttribute("activities");
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a"));
        activities.add(0, message + " (" + timestamp + ")");

        return "redirect:/";
    }
}
