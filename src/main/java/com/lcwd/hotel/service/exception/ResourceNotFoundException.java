package com.lcwd.hotel.service.exception;

public class ResourceNotFoundException extends Exception{
	
	public ResourceNotFoundException() {
		super("Resource Not Found");
	}
	
public ResourceNotFoundException(String message) {
		super(message);
	}

}
