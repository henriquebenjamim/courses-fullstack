package com.henriquebenjamim.coursesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquebenjamim.coursesmanager.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
  
}
