package com.mentorondemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentorondemand.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long>
{

}
