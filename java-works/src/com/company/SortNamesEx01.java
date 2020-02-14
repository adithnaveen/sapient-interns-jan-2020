package com.company;

import java.util.Arrays;

public class SortNamesEx01 {
	public static void main(String[] args) {
		String [] names = {"Prerana", "Vivek", "Suraj", "Nikit", "Jaswanth"}; 
		
		for(String str : names) {
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		
		
		Arrays.sort(names); 
		
		for(String str : names) {
			System.out.println(str);
		}
	}
}
