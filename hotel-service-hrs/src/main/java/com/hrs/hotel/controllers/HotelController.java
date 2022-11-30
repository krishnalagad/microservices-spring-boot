package com.hrs.hotel.controllers;

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

import com.hrs.hotel.entities.Hotel;
import com.hrs.hotel.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
		Hotel savedHotel = this.hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.OK).body(savedHotel);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> get(@PathVariable("hotelId") String hotelId){
		Hotel hotel = this.hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		List<Hotel> allHotels = this.hotelService.getAllHotels();
		return ResponseEntity.status(HttpStatus.OK).body(allHotels);
	}
}
