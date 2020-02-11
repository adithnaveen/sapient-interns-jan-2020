package com.company.dp.abstrat.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equals("vehicle")) {
			return new VehicleFactory(); 
		}else if(factoryName.equals("color")) {
			return new ColorFactory(); 
		}
		
		return null; 
	}
}
