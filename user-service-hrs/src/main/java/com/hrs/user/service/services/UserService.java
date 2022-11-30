package com.hrs.user.service.services;

import java.util.List;

import com.hrs.user.service.entities.User;

public interface UserService {
	
	// create user
	User saveUser(User user);
	
	// get all users
	List<User> getAllUsers();
	
	// get one user by id
	User getUser(String userID);

}
