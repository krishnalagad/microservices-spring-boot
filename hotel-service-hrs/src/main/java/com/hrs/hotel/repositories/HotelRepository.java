package com.hrs.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrs.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
