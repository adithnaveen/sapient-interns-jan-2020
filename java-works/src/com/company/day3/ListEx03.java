package com.company.day3;

import java.util.Vector;

// vector 
public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(7, 6); 
		
		
		System.out.println("initial vector : " + vector);
		System.out.println("Initial Size : " + vector.size());
		// capacity method is defined only in vector class 
		// not in collection/List interface (Vector implements List) 
		System.out.println("Initial Capacity " + vector.capacity());
		
		vector.add("One"); 
		vector.add("Two"); 
		vector.add("Three"); 
		vector.add("Four"); 
		vector.add("Five"); 	
		
		vector.add("One"); 
		vector.add("Two"); 
		vector.add("Three"); 
		vector.add("Four"); 
		vector.add("Five"); 

		vector.add("Six"); 
		
		

		System.out.println("After inserting vector : " + vector);
		System.out.println("After inserting Size : " + vector.size());
		System.out.println("After inserting Capacity " + vector.capacity());
		
		
	}
}
