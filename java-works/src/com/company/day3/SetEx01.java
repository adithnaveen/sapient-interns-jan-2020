package com.company.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		
		set.add("Lenovo"); 
		set.add("Dell"); 
		set.add("Microsoft"); 
		System.out.println(set.add("Mac"));
		System.out.println(set.add("Mac"));
		set.add("Mac"); 
		set.add("Mac"); 
		
		System.out.println(set);
		
	}
}
