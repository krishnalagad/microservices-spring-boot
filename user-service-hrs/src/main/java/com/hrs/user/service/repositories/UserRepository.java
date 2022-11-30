package com.hrs.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrs.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	// custome JPA methods here below
}
