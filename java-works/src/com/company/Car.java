package com.company;

public class Car extends FourWheeler {
	private int gear; 
	private int doors; 

	
	public Car(int noOfSeats, int fuelCapacity, int gear, int doors) {
		super(noOfSeats, fuelCapacity);
		
		this.gear = gear; 
		this.doors = doors; 
	}


	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear; 
	}


	public int getDoors() {
		return doors;
	}


	@Override
	public void move() {
		System.out.println("Car is Moving... ");
	}


	@Override
	public void stop() {
		System.out.println("Car Stops... ");
	}
	
	
	
	
}
