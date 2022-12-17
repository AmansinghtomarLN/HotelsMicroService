package com.lcwd.hotel.service.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entities.Hotels;
import com.lcwd.hotel.service.exception.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepository;
import com.lcwd.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotels create(Hotels hotel) {	
		hotel.setId(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotels> getAll() {	
		return hotelRepository.findAll();
	}

	@Override
	public Hotels getHotel(String id) {
		return hotelRepository.findById(id).orElseThrow();
	}

}
