package com.company;

public abstract class FourWheeler extends Vehicle{

	private int speed;
	private int fuelCapacity; 

	public FourWheeler(int noOfSeats, int fuelCapacity) {
		super(noOfSeats);

		this.fuelCapacity = fuelCapacity; 
	}
	
	public void accelarate() {
		System.out.println("Vehicle Moving at " + speed ++);  
		
	}
	
	public void fuelCapacity() {
		System.out.println("Fuel Capacity of Four Wheeler is " + fuelCapacity);
	}
}
