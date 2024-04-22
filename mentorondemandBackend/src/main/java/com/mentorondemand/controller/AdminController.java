package com.mentorondemand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.model.Course;
import com.mentorondemand.model.Role;
import com.mentorondemand.model.User;
import com.mentorondemand.service.CourseService;
import com.mentorondemand.service.RoleService;
import com.mentorondemand.service.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;

	public AdminController(CourseService courseService, UserService userService) {
		super();
		this.courseService = courseService;
		this.userService = userService;
	}
	
	// build create course REST API
	//http://localhost:9191/admin/course/add
	@PostMapping("/course/addcourse")
	public ResponseEntity<Course> saveCourse(@RequestBody Course course){
		return new ResponseEntity<Course>(courseService.saveCourse(course), HttpStatus.CREATED);
	}
	
	
	// build create user REST API
	//http://localhost:9191/admin/user/add
	@PostMapping("/user/adduser")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.ACCEPTED);
	}
	
	// build all courses REST API
	//http://localhost:9191/admin/getcourse
	@GetMapping("/getcourse")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	// build all users REST API
	//http://localhost:9191/admin/getuser
	@GetMapping("/getuser")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	// build all courses REST API
    //http://localhost:9191/admin/getrole
	@GetMapping("/getrole")
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
	//build delete course REST API
	//http://localhost:9191/admin/course/delete/1
	@DeleteMapping("/course/deletecourse/{course_id}")
	public ResponseEntity<String> deleteCourse(@PathVariable("course_id") long course_id){
		
		//delete course but not from database
		courseService.deleteCourse(course_id);
		
		return new ResponseEntity<String>("Course deleted successfully!.", HttpStatus.OK);
	}
	
	// build delete user REST API
	//http://localhost:9191/admin/user/delete/1
	@DeleteMapping("/user/deleteuser/{user_id}")
	public ResponseEntity<String> deleteUser(@PathVariable("user_id") long user_id){
		
		//delete user but not from database
		userService.deleteUser(user_id);
			
		return new ResponseEntity<String>("User deleted successfully!.", HttpStatus.OK);
	}
	
	//build get user by id REST API
	//http://localhost:9191/admin/getuserbyroleid/1
	@GetMapping("/getuserbyroleid/{user_role}")
	public List<User> getUserByRoleId(@RequestParam("user_role") String user_role){
		return userService.getUserByRoleId(user_role);
	}
	
}
