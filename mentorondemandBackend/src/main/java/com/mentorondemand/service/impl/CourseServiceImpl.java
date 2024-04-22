package com.mentorondemand.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mentorondemand.exception.ResourceNotFoundException;
import com.mentorondemand.model.Course;
import com.mentorondemand.repository.CourseRepository;
import com.mentorondemand.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	private CourseRepository courseRepository;
	
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}


	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course); 
	}


	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}


	@Override
	public void deleteCourse(long course_id) {
		// check whether a user exist in a DB or not
		courseRepository.findById(course_id).orElseThrow(() -> 
							new ResourceNotFoundException("Course", "course_id", course_id));
		courseRepository.deleteById(course_id);
	}
	

}
