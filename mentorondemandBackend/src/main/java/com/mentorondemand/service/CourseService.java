package com.mentorondemand.service;

import java.util.List;

import com.mentorondemand.model.Course;

public interface CourseService {
	Course saveCourse(Course course);
	List<Course> getAllCourses();
	void deleteCourse(long course_id);
}
