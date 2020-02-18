package com.company.springbootworks01.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.springbootworks01.service.EmployeeServiceProxy;

@RestController
public class GroupController {

	@Autowired(required = true)
	private EmployeeServiceProxy employeeServiceProxy;
	
	// here the group id logic is still not implemented, 
	// and the employee information will be taken from 
	// another micro service 
	@GetMapping("/groups/{groupId}/{empId}")
	public Object getGroupWithEmployees( @PathVariable int groupId, 
				@PathVariable int empId) {
		System.out.println("Requested Group ID " + groupId);
		return employeeServiceProxy.getEmployee(empId); 
	} 
	
}
