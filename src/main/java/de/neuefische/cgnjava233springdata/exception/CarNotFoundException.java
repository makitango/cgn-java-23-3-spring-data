package de.neuefische.cgnjava233springdata.exception;

public class CarNotFoundException extends RuntimeException{
	public CarNotFoundException(String message){
		super(message);
	}
}
