package com.hrs.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hrs.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	// custome finder method
	List<Rating> findByUserId(String id);
	
	List<Rating> findByHotelId(String id);

}
