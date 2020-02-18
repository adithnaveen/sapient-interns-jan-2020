package com.company.java8features;

import java.util.stream.IntStream;

public class LambdaEx03 {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0; i<600; i++) {
					System.out.println("I value is " + i);
				}
				
			}
		}).start();
		
		
		// in lambda way 
		new Thread( () ->  {
			IntStream.range(1, 500).forEach(System.out :: println);
		}).start();; 
		
	}
}
