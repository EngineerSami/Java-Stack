package com.axsos.usersandcourses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.usersandcourses.models.User;
import com.axsos.usersandcourses.repositories.UserRepository;

@Service
public class UserService {
    @Autowired 
    UserRepository userRepository;
    
    public User createUser(User User) {
        return userRepository.save(User);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
