package com.hrs.rating.services;

import java.util.List;

import com.hrs.rating.entities.Rating;

public interface RatingService {
	
	Rating createRating(Rating rating);
	
	Rating getRatingById(String id);
	
	// get all ratings
	List<Rating> getAllRatings();
	
	// get all ratings by user
	List<Rating> getAllByUserId(String id);
	
	// get all ratings by hotel
	List<Rating> getAllByHotelId(String id);
	
	

}
