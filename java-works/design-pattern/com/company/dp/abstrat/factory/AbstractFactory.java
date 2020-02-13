package com.company.dp.abstrat.factory;

public abstract class AbstractFactory {
	public abstract IVehicle getVehicle(String vehicle); 
	public abstract IColor getColor(String color); 
}


class ColorFactory extends AbstractFactory{

	// also an example for adapter pattern 
	// filter pattern 
	@Override
	public IVehicle getVehicle(String vehicle) {
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color.equals("red")) {
			return new Red();
		}else if(color.equals("blue")) {
			return new Blue(); 
		}
		return null;
	}
	
}


class VehicleFactory extends AbstractFactory{

	@Override
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("car")) {
			return new Car(); 
		}else if(vehicle.equals("truck")) {
			return new Truck(); 
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}