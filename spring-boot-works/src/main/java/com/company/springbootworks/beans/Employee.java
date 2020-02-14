package com.company.springbootworks.beans;

//import org.springframework.hateoas.Link;
//import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee{ // extends RepresentationModel<Employee> {
	private int id; 
	private String empName; 
	private int empAge; 
	private String email; 
	
	private Address address;

}
