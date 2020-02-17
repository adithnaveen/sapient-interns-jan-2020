package com.company.springbootworks.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.company.springbootworks.beans.Address;
import com.company.springbootworks.beans.Employee;

// this optional 
@Component
public class EmployeeService {
	private static List<Employee> employees = new ArrayList<Employee>();

	static {
		employees.add(new Employee(101, "Yateesha", 22, "yateesha@ps.com",
						0, new Address("101", "GreenWood Blvd", "Reston", "USA"))); 
		
		employees.add(new Employee(123, "Anjana", 22, "anjana@ps.com",
						0, new Address("GF-123", "Stevens Creek Blvd", "Cupertino", "USA"))); 
				
		employees.add(
				new Employee(133, "Vivek", 23, "vivek@ps.com",
						0, new Address("TF-234", "Concord Layout Blvd", "RR Nagar", "India"))); 
				
		employees.add(
				new Employee(145, "Jaswanth", 23, "jaswanth@ps.com",
						0, new Address("222", "Marathalli", "Bengaluru", "India")));
	}
	// CRUD 
	public List<Employee> getAllEmployees(){
		return employees; 
	}
	
	
	public Employee saveEmployee(Employee employee) {
		
		System.out.println("Employee got to save  is "  + employee );
		if(employee.getId()==0) {
			employee.setId(employees.size()+1);
		}
		employees.add(employee); 
		
		return employee; 
		
	}
	
	
	public Employee findOneEmployee(int empId) {
		for(Employee emp : employees) {
			if(emp.getId() == empId) {
				return emp; 
			}
		}
		return null; 
	}
	
	public Employee updateEmployee(Employee employee) {
		this.deleteEmployee(employee.getId()); 
		employees.add(employee); 
		return employee; 
	}
	
	
	public Employee deleteEmployee(int empId) {
		for(Employee emp : employees) {
			if(emp.getId() == empId) {
				employees.remove(emp); 
				return emp; 
			}
		}
		return null; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
