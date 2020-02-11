package com.company02.annotation;

import org.springframework.beans.factory.annotation.Value;

public class GreetFrench implements Greeting{


	@Value(value = "Hari")
	private String name; 
	
	public String sayHello() {
		return "Bonjour " + name; 
	}
}
