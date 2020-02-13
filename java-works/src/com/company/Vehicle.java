package com.company;

public abstract  class Vehicle {
	
	private int noOfSeats; 
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public Vehicle(int noOfSeats) {
		this.noOfSeats = noOfSeats; 
	}

	public Vehicle() {
		this.noOfSeats = 1; 
	}
	
	// access_specifier access_modifier return method_name(params)
	public abstract void move();
	
	public abstract void stop() ; 
	
	public void seatCapacity() {
		System.out.println("Seat capacity of vehicle "+ noOfSeats);
	}
}
