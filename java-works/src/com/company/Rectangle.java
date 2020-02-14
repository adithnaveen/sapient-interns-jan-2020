package com.company;

public class Rectangle implements Shape{

	private int length; 
	private int bredth; 
	
	
	
	public Rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is " + (length * bredth));
	}
	
}
