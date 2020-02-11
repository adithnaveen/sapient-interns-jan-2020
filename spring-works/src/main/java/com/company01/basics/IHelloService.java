package com.company01.basics;

public interface IHelloService {
	// the parameters will be injected from external resources 
	public String sayHello(); 
	
	// you can hardcode in program 
	public String sayHello(String name, String city); 
}
