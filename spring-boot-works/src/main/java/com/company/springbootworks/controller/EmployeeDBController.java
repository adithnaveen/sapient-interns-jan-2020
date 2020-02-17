package com.company.springbootworks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.service.EmployeeDBService;
import com.company.springbootworks.service.EmployeeService;

@RestController
public class EmployeeDBController {

	@Autowired
	private EmployeeDBService employeeSerivce; 
	
	
	
	@PostMapping("/db/emps")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeSerivce.insertEmployee(employee); 
	}
	
	@GetMapping("/db/emps")
	public List<Employee> getAllEmployees(){
		return employeeSerivce.getAllEmployees(); 
	}
	
	
	@GetMapping("/db/emps/{empId}")
	public Optional<Employee> getEmployee(@PathVariable int empId) {
		return employeeSerivce.getEmployeeById(empId); 
	}
	
	@PutMapping("/db/emps")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeSerivce.updateEmployee(employee); 
	}
	
	@DeleteMapping("/db/emps/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		employeeSerivce.deleteEmployee(empId);
	}
	
	@GetMapping("/db/emps/age/{empAge}")
	public List<Employee> getEmployeeGreaterThanAge(@PathVariable int empAge){
			return employeeSerivce.getEmployeesByAge(empAge); 
	}
	
	
	
	
	
	
	
}
