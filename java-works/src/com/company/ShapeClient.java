package com.company;

public class ShapeClient {
	public static void main(String[] args) {
		Shape s = new Rectangle(10, 20); 
		s.area(); 
		
		s = new Circle(10); 
		s.area(); 
	}
}
