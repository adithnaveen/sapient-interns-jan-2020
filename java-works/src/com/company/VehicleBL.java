package com.company;

public class VehicleBL {
	public static void process(Vehicle [] vehicles) {

		for (Vehicle vehicle : vehicles) {
			
			System.out.println("-----------------------------------------");
			vehicle.move();
			vehicle.stop();
			vehicle.seatCapacity();

			if (vehicle instanceof Car) {

				((Car) vehicle).accelarate();
				((Car) vehicle).accelarate();
				((Car) vehicle).fuelCapacity();

			} else if (vehicle instanceof Jeep) {
				((Jeep) vehicle).canGoOffRoad();
			}
		}
	}
}
