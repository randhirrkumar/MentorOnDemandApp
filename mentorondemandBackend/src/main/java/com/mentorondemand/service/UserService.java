package com.mentorondemand.service;

import java.util.List;

import com.mentorondemand.model.User;

public interface UserService {
	User saveUser(User user);
	List<User> getAllUsers();
	void deleteUser(long user_id);
	List<User> getUserByRoleId(String user_role);
}
