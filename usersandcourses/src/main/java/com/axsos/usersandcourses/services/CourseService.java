package com.axsos.usersandcourses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.usersandcourses.models.Course;
import com.axsos.usersandcourses.repositories.CourseRepository;

@Service
public class CourseService {
    @Autowired 
    CourseRepository courseRepository;
    
    public Course createCourse(Course Course) {
        return courseRepository.save(Course);
    }
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
