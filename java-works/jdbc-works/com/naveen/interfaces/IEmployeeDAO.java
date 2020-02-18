package com.naveen.interfaces;

import java.util.List;

import com.naveen.beans.Employee;

// contract 
public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee); 
	public boolean deleteEmployee(int empId); 
	public boolean updateEmployeeSalary(int empId, double empSal);
	public Employee getemployee(int empId); 
	public List<Employee> getAllEmployees(); 
}
