package com.company.day2;

import java.util.ArrayList;

public class ListEx01 {
	// raw type 
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList(); 
		
		list.add("hi"); 
		list.add(true); 
		list.add(23.4); 
		list.add(new Object()); 
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
