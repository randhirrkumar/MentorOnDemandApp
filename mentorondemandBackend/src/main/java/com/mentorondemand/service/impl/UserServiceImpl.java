package com.mentorondemand.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mentorondemand.exception.ResourceNotFoundException;
import com.mentorondemand.model.User;
import com.mentorondemand.repository.UserRepository;
import com.mentorondemand.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(long user_id) {
		
		// check whether a user exist in a DB or not
		userRepository.findById(user_id).orElseThrow(() -> 
							new ResourceNotFoundException("User", "user_id", user_id));
		userRepository.deleteById(user_id);
	}

	@Override
	public List<User> getUserByRoleId(String userRole) {
		List<User> userlist = userRepository.findAllByUserRole(userRole);
		return userlist;
	}

//	@Override
//	public List<User> getUserByRoleId(String user_role) {
//		List<User> userlist = userRepository.findAllByUser_role(user_role);
//		return userlist;
//	}

	

}
