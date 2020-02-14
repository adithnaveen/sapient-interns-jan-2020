package com.company.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("Karteek", 1000); 
		map.put("Siddhant", 1500); 
		map.put("Srinidhi", 2000); 
		map.put("Prerana", 2500); 
		
		
		System.out.println(map.get("Karteek"));
		System.out.println(map.get("Siddhant"));
		System.out.println(map.get("Srinidhi"));
		
		System.out.println("-------------------------------------");
		
		Iterator itr  = map.entrySet().iterator(); 
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> temp= (Entry<String, Integer>) itr.next(); 
			
			
			System.out.println(temp.getKey() +", " + temp.getValue());
			
		}
		
	}
}
