package com.axsos.usersandcourses.repositories;

import java.util.List;
import com.axsos.usersandcourses.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();
}
