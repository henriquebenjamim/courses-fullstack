package com.henriquebenjamim.coursesmanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.henriquebenjamim.coursesmanager.enums.Category;
import com.henriquebenjamim.coursesmanager.model.Course;
import com.henriquebenjamim.coursesmanager.model.Lesson;
import com.henriquebenjamim.coursesmanager.repository.CourseRepository;

@SpringBootApplication
public class CoursesManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory(Category.BACK_END);

			Lesson l = new Lesson();

			l.setName("Introdução");
			l.setYoutubeUrl("watch?v=11");
			l.setCourse(c);
			c.getLessons().add(l);

			Lesson l1 = new Lesson();

			l1.setName("Core do Angular");
			l1.setYoutubeUrl("watch?v=22");
			l1.setCourse(c);
			c.getLessons().add(l1);

			courseRepository.save(c);
		};
	}

}
