package com.naveen.app;

import com.naveen.beans.Employee;
import com.naveen.dao.EmployeeDAO;
import com.naveen.interfaces.IEmployeeDAO;

public class EmployeeApp {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO(); 
		
		Employee employee = new Employee(104, "Harish", 4444, "harish@ps.com", 20); 
		
		/*
		 * System.out.println( dao.insertEmployee(employee)?
		 * "Inserted":"Sorry Not inserted");
		 */

		for(Employee temp : dao.getAllEmployees()) {
			System.out.println(temp);
		}
	}
}

