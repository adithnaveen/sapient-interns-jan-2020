package com.company.dp.abstrat.factory;

public interface IVehicle {
	public void move(); 
	public void stop(); 
}

class Car implements IVehicle{

	@Override
	public void move() {
			System.out.println("Car Moves.. ");
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stops... ");
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("Truck Moves.. ");
	}

	@Override
	public void stop() {
		System.out.println("Truck Stops... ");
	}
	
}
