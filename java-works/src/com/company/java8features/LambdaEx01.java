package com.company.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6); 
		
		// old code 
		for(Integer x : number) {
			System.out.println(x);
		}
		
		// java 8 way 
		// 1. 
		System.out.println("--------------java 8 way ---------------------");
		number.forEach(temp -> System.out.println(temp));
		
		//2. 
		System.out.println("--------------java 8 way ---------------------");
		number.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println("--------------java 8 way - method ref ---------------------");

		
		number.forEach(System.out :: println);
	}
}



















