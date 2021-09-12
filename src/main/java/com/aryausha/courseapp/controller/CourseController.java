package com.aryausha.courseapp.controller;

import com.aryausha.courseapp.model.Courses;
import com.aryausha.courseapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    public CourseRepository repos;

    @GetMapping("/")
    public String courses()
    {
        return "welcome to the course";
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addcourse")
    public String addcourse(@RequestBody Courses c)
    {
        repos.insert(c);
        return  "Successfully Inserted";
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/viewcourses")
    public List<Courses> viewcourses()
    {
        return repos.findAll();
    }
}
