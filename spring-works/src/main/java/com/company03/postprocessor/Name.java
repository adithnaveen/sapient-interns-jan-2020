package com.company03.postprocessor;

public class Name {
	private String firstName; 
	private String lastName;
	
	public Name() {
		System.out.println("In Constructor Name... ");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	} 
	
	
	
}
