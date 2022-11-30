package com.hrs.hotel.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrs.hotel.entities.Hotel;
import com.hrs.hotel.exceptions.ResourceNotFoundException;
import com.hrs.hotel.repositories.HotelRepository;
import com.hrs.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		this.hotelRepository.save(hotel);
		return null;
	}

	@Override
	public List<Hotel> getAllHotels() {
		List<Hotel> allHotels = this.hotelRepository.findAll();
		return allHotels;
	}

	@Override
	public Hotel getHotel(String hotelId) {
		Hotel hotel = this.hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel", "ID", hotelId));
		return hotel;
	}

}
