package com.company.dp.abstrat.factory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle"); 

		IVehicle vehicle = vehicleFactory.getVehicle("car");
		vehicle.move();
		vehicle.stop();
		
		vehicle = vehicleFactory.getVehicle("truck"); 
		vehicle.move();
		vehicle.stop();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color"); 
		
		IColor color = colorFactory.getColor("red"); 
		color.paidColor(); 
		
		color = colorFactory.getColor("blue"); 
		color.paidColor();
	}
}