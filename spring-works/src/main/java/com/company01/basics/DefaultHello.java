package com.company01.basics;

public class DefaultHello implements IHelloService{

	private String name; 
	private String city; 

	public DefaultHello() {
		System.out.println("in DefaultHello, default Constructor");
	}
	
	public DefaultHello(String name, String city) {
		this.name = name; 
		this.city = city; 
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String sayHello() {
		// if you dont pass any argument i'll use the value 
		// from the instance variable 
		return this.sayHello(this.name, this.city); 
	}

	public String sayHello(String name, String city) {
		
		String [] myStr = {
				"Hey How are you Mr/Ms/Mrs %s & How is your city %s", 
				"Good Morning %s, & heard you are in %s", 
				"Mr/Ms/Mrs: %s, what is your %s famous for"
		}; 
		
		int randomNumber = (int) (Math.random()*3); 
		
		return String.format(myStr[randomNumber].toString(), name, city); 
		
	}
	
}














