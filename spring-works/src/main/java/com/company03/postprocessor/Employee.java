package com.company03.postprocessor;

public class Employee {
	private int empId; 
	private String email; 
	private Name name; 
	private double salary;
	
	public Employee() {
		System.out.println("In constructor Employee");
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", name=" + name + ", salary=" + salary + "]";
	} 
	
	
	
}
