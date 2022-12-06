package com.hrs.rating.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrs.rating.entities.Rating;
import com.hrs.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.ratingService.createRating(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getAllRatings());
	}
	
	@GetMapping("/users/{uId}")
	public ResponseEntity<List<Rating>> getAllByUser(@PathVariable("uId") String uId){
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getAllByUserId(uId));
	}
	
	@GetMapping("/hotels/{hId}")
	public ResponseEntity<List<Rating>> getAllByHotel(@PathVariable("hId") String hId){
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getAllByHotelId(hId));
	}
	
	@GetMapping("/{rId}")
	public ResponseEntity<Rating> getRating(@PathVariable("rId") String id){
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingService.getRatingById(id));
	}

}
