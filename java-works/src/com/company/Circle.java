package com.company;

public class Circle implements Shape {
	private int radius;

	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle is " + (Shape.PI * radius * radius));
	} 
	
}
