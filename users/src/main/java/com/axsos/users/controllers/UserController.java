package com.axsos.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.axsos.users.models.User;
import com.axsos.users.services.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Show Registration and Login Forms
    @GetMapping("/")
    public String showForms(User user) {
        return "index"; // Return the page with both registration and login forms
    }

    // Handle Registration
    @PostMapping("/register")
    public String registerUser(@Valid User user, BindingResult result, Model model) {

        // Delegate registration logic to the service
        if (!userService.registerUser(user, result)) {
            return "index";  // Return to registration form with validation errors
        }

        return "redirect:/"; // Redirect back to the page (or to a login page after successful registration)
    }

    // Handle Login
    @PostMapping("/login")
    public String login(User user, Model model) {

        // Delegate login logic to the service
        User foundUser = userService.authenticateUser(user);

        // If user is found and passwords match
        if (foundUser != null) {
            model.addAttribute("username", foundUser.getUsername());
            return "success"; // Redirect to success page if login is successful
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index"; // Stay on the same page if login fails
        }
    }
}