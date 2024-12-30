package com.axsos.usersandcourses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.usersandcourses.models.Course;
import com.axsos.usersandcourses.services.CourseService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired 
    private CourseService courseService;

    @GetMapping("/")
    public String listCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        model.addAttribute("course", new Course()); 
        return "index"; 
    }

    @GetMapping("/new")
    public String newCourse(Model model) {
        model.addAttribute("course", new Course());
        return "newcourse"; 
    }

    @PostMapping("/new")
    public String createNewCourse(@Valid @ModelAttribute("course") Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<Course> courses = courseService.getAllCourses();
            model.addAttribute("courses", courses);
            return "index"; 
        } else {
            courseService.createCourse(course);
            return "redirect:/courses/"; 
        }
    }
}