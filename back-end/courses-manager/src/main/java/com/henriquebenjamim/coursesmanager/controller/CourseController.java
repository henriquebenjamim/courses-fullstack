package com.henriquebenjamim.coursesmanager.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriquebenjamim.coursesmanager.model.Course;
import com.henriquebenjamim.coursesmanager.service.CourseService;

@Validated
@RestController
@RequestMapping("/api/courses")
public class CourseController {
  
  private final CourseService courseService;

  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping
  public List<Course> list() {
    return courseService.list();
  }
}
