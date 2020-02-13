package com.company.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {
	public static void main(String[] args) {
		Set<Device> set = new HashSet<Device>(); 
		
		set.add(new Device(101, "Computer", 700)); 
		set.add(new Device(34, "Mouse", 20)); 
		set.add(new Device(55, "Key Board", 23)); 
		set.add(new Device(66, "Watch", 100)); 
		set.add(new Device(66, "Watch", 100)); 
		set.add(new Device(66, "Watch", 100)); 
		
		for(Device temp : set) {
			System.out.println(temp +", " + temp.hashCode());
		}
	}
}
