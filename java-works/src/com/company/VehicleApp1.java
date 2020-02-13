package com.company;


public class VehicleApp1 {
	public static void main(String[] args) {

		// this will hold the reference
		Vehicle vehicles[] = new Vehicle[5];

		vehicles[0] = new Car(5, 35, 6, 3);
		vehicles[1] = new Car(4, 32, 4, 5);
		vehicles[2] = new Jeep(7, 40, true);
		vehicles[3] = new Car(6, 36, 7, 7);
		vehicles[4] = new Jeep(8, 50, false);

		
		VehicleBL.process(vehicles);

	}

}
