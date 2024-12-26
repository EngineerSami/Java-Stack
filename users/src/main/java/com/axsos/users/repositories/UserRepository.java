package com.axsos.users.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.axsos.users.models.User;

public interface UserRepository extends JpaRepository<User, String> {
    // Custom query to find a user by their username
    User findByUsername(String username);
}