package com.company.dp;



class Car{
	public static Car createCar(CARS car) {
		
		if(car.equals(CARS.AUDI)) {
			return new Audi(); 
		}else if(car.equals(CARS.MARUTI)){
			return new Maruti(); 
		}else if(car.equals(CARS.BMW)) {
			return new BMW(); 
		}
		
		return null; 
	}
}

class BMW extends Car {
	public BMW() {
		System.out.println("BMW Creating");
	}
}
class Maruti extends Car{
	public Maruti() {
		System.out.println("Maruti Creating");
	}
}
class Audi extends Car {
	public Audi() {
		System.out.println("Audi Creating");
	}
}



public class FactoryPatternEx {
	public static void main(String[] args) {
		Car c =  Car.createCar(CARS.AUDI); 
		
		
		
	}
}
