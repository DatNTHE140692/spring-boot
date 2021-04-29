package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Course;
import com.example.springbootdemo.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }
}
