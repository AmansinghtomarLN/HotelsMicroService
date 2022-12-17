package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.entities.Hotels;

public interface HotelService {

	Hotels create(Hotels hotel);
	
	List<Hotels> getAll();
	
	Hotels getHotel(String id);
	
}
