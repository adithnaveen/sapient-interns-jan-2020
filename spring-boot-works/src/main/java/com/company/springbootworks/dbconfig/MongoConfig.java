package com.company.springbootworks.dbconfig;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.springbootworks.beans.Address;
import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.repo.EmployeeRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig {

	
	
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return string -> {
			System.out.println("******************in commandLineRunner******************");
			new Employee(12345, "Pavan", 22, "pavan@ps.com",
					0, new Address("321", "GreenLine Blvd", "Reston", "USA")); 
		};
	}
	
}
