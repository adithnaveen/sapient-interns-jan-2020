package com.company;



public class VehicleApp {
	public static void main(String[] args) {
		Car car = new Car(4, 35, 0, 3);
		
		car.move(); 
		car.stop();
		car.seatCapacity(); 
		
		car.accelarate();
		car.accelarate();
		
		car.fuelCapacity();
		
		System.out.println("Number of Doors in Car " + car.getDoors()); 
		
		car.setGear(1);
		System.out.println("Car Running @ " + car.getGear() +" gear");
		
		
		
		Jeep jeep = new Jeep(7, 40, true); 
		
		
		jeep.accelarate(); 
		jeep.accelarate(); 
		
		jeep.fuelCapacity(); 
		
		jeep.move(); 
		jeep.stop();
		jeep.seatCapacity(); 
		
		jeep.canGoOffRoad(); 
		
	}
}
