package com.hrs.rating.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrs.rating.entities.Rating;
import com.hrs.rating.repository.RatingRepository;
import com.hrs.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating createRating(Rating rating) {
		Rating savedRating = this.ratingRepository.save(rating);
		return savedRating;
	}

	@Override
	public List<Rating> getAllRatings() {
		List<Rating> allRatings = this.ratingRepository.findAll();
		return allRatings;
	}

	@Override
	public List<Rating> getAllByUserId(String id) {
		List<Rating> findByUserId = this.ratingRepository.findByUserId(id);
		return findByUserId;
	}

	@Override
	public List<Rating> getAllByHotelId(String id) {
		List<Rating> findByHotelId = this.ratingRepository.findByHotelId(id);
		return findByHotelId;
	}

	@Override
	public Rating getRatingById(String id) {
		Rating rating = this.ratingRepository.findById(id).get();
		return rating;
	}

}
