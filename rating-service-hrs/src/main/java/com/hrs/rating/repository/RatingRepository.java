package com.hrs.rating.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hrs.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

}
