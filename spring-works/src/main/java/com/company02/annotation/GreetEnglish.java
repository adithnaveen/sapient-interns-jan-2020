package com.company02.annotation;

import org.springframework.beans.factory.annotation.Value;

public class GreetEnglish implements Greeting {

	@Value(value = "Naveen")
	private String name; 
	
	public String sayHello() {
		return "Hello " + name; 
	}
	
}
