package com.company.dp.mvc;

// model 
public class EmployeeDAO {
	// this file should help to get the data from external resource 
	// DB, XML etc 
	
	public Employee getEmployee() {
		Employee employee = new Employee(); 
		
		employee.setEmpId(101);
		employee.setEmpName("Kumar"); 
		employee.setEmpSal(1234); 
		return employee; 
	}
}
