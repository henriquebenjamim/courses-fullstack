package com.henriquebenjamim.coursesmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.henriquebenjamim.coursesmanager.model.Course;
import com.henriquebenjamim.coursesmanager.repository.CourseRepository;

@Validated
@Service
public class CourseService {
  
  private final CourseRepository courseRepository;

  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public List<Course> list() {
    return courseRepository.findAll();
  }
}
