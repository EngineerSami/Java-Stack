package com.axsos.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DashboardController {

    @RequestMapping("/")
    public String dashboard() {
        return "dashboard"; 
    }

    @RequestMapping("/date")
    public String date(Model model) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        String formattedDate = dateFormat.format(new Date());
        
        model.addAttribute("currentDate", formattedDate);
        return "date"; 
    }

    @RequestMapping("/time")
    public String time(Model model) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(new Date());
        
        model.addAttribute("currentTime", formattedTime);
        return "time"; 
    }
}