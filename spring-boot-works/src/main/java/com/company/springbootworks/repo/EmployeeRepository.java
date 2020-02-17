package com.company.springbootworks.repo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.springbootworks.beans.Employee;

public interface EmployeeRepository 
	extends MongoRepository<Employee, Integer>{

	
	// if mongo repository doesnot give implicit method 
	

	@Query(value="{'empAge':{$gt:?0}}",
		fields = "{'empName':1, 'empAge':1, 'email':1, 'address.street':1}")
	List<Employee> findByAge(int empAge); 
}
