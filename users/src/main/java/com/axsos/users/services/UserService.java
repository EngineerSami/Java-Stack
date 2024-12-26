package com.axsos.users.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.users.models.User;
import com.axsos.users.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register new user
    public boolean registerUser(User user, BindingResult result) {

        // Check if password and confirmPassword match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "error.user", "Passwords do not match.");
            return false;  // Passwords don't match, return false
        }

        // Check if username already exists
        if (userRepository.findByUsername(user.getUsername()) != null) {
            result.rejectValue("username", "error.user", "Username already exists.");
            return false;  // Username already taken, return false
        }

        // Save the user if validation passes
        userRepository.save(user);
        return true;  // User successfully registered
    }

    // Authenticate user (Login)
    public User authenticateUser(User user) {
        // Find the user by username and check if passwords match
        User foundUser = userRepository.findByUsername(user.getUsername());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return foundUser;  // Return the found user if credentials are correct
        }
        return null;  // Return null if user is not found or passwords do not match
    }
}