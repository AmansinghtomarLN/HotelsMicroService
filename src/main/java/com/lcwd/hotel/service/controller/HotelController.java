package com.lcwd.hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.service.entities.Hotels;
import com.lcwd.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotels> createHotel(@RequestBody Hotels hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotels> getHotel(@PathVariable String hotelId){
		return ResponseEntity.ok().body(hotelService.getHotel(hotelId));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotels>> getAll(){
		return ResponseEntity.ok().body(hotelService.getAll());
	}
	
}
