package com.company.bl;

public class TestMe {
	public boolean sayHi() {
		return true; 
	}
	
	public String sayHi(String name) {
		return "Hi " + name; 
	}
	
	public String testTime(String message) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Message " + message; 
	}
	
	public int throwsSomeException(int val) {
		if(val<1) {
			throw new RuntimeException("you cannot pass lessthan 1 "); 
		}else {
			System.out.println("value passed is " + val);
			return val; 
		}
	}
}
