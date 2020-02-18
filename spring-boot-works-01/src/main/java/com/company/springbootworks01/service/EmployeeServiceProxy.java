package com.company.springbootworks01.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



// this program will take the data from other microservice 

// in the first version lets have this
// because there will be multiple instance of emp-management (-Dserver.port=8001)
// will be running, we can give list of server URL/URI in 
// application properties. 
//@FeignClient(name="emp-management", url="localhost:8000")
@FeignClient(name="emp-management")
//@RibbonClient(name="emp-management")
public interface EmployeeServiceProxy {
	@GetMapping("/emps/{empId}")
	
	public HttpEntity<Object> getEmployee(@PathVariable("empId") int empId); 
}
