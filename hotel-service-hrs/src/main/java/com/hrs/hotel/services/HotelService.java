package com.hrs.hotel.services;

import java.util.List;

import com.hrs.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel createHotel(Hotel hotel);
	
	List<Hotel> getAllHotels();
	
	Hotel getHotel(String hotelId);

}
