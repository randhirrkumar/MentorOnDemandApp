package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Data
@Entity
@Table(name="course")
@SQLDelete(sql = "UPDATE course SET status = true WHERE course_id=?")
@Where(clause = "status=false")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private long course_id;
	
	@Column(name = "course_name", nullable = false)
	private String course_name;
	
	@Column(name = "course_description")
	private String course_description;
	
	
	
	
	
	private boolean status = Boolean.FALSE;
	
	
	
//	public int getCourse_id() {
//		return course_id;
//	}
//	public void setCourse_id(int course_id) {
//		this.course_id = course_id;
//	}
//	public String getCourse_name() {
//		return course_name;
//	}
//	public void setCourse_name(String course_name) {
//		this.course_name = course_name;
//	}
//	public String getCourse_description() {
//		return course_description;
//	}
//	public void setCourse_description(String course_description) {
//		this.course_description = course_description;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	
//	public Course()
//	{
//		
//	}
//	public Course(int course_id, String course_name, String course_description, String status) {
//		super();
//		this.course_id = course_id;
//		this.course_name = course_name;
//		this.course_description = course_description;
//		this.status = status;
//	}
	
	
	
	
	
}
