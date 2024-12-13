package com.axsos.Omikuji;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {

    @RequestMapping("")
    public String omikujiForm() {
        return "omikujiForm"; 
    }

    @PostMapping("/process")
    public String processOmikuji(
        @RequestParam("number") int number,
        @RequestParam("city") String city,
        @RequestParam("person") String person,
        @RequestParam("hobby") String hobby,
        @RequestParam("livingThing") String livingThing,
        @RequestParam("niceMessage") String niceMessage,
        HttpSession session
    ) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("niceMessage", niceMessage);

        return "redirect:/omikuji/show";
    }

    @RequestMapping("/show")
    public String showOmikuji(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("livingThing", session.getAttribute("livingThing"));
        model.addAttribute("niceMessage", session.getAttribute("niceMessage"));

        return "omikujiShow"; 
    }
}
