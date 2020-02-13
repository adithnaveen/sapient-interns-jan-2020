package com.company06.db;

import java.util.List;

import javax.sql.DataSource;

public interface IEmployeeDAO {
	public boolean create(Employee employee); 
	public Employee getEmployee(int empId); 
	public Employee updateEmployee(int empId, 
				double newSalary); 
	public boolean deleteEmployee(int empId); 
	public List<Employee> getAllEmployees(); 
	
	// to set the data source 
	public void setDataSource(DataSource ds);
	
}
