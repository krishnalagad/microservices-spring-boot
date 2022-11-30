package com.hrs.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrs.user.service.entities.User;
import com.hrs.user.service.exceptions.ResourceNotFoundException;
import com.hrs.user.service.repositories.UserRepository;
import com.hrs.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		User savedUser = this.userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUsers() {

		List<User> allUsers = this.userRepository.findAll();
		return allUsers;
	}

	@Override
	public User getUser(String userID) {
		User user = this.userRepository.findById(userID)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", userID));
		return user;
	}

}
