package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Course;
import com.example.springbootdemo.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController implements Serializable {
    private static final long serialVersionUID = 1L;
    private final CourseService courseService;

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
}
