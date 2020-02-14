package com.company.springbootworks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.springbootworks.beans.User;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World from Spring Boot"; 
	}
	
	@GetMapping("/hello-world/{name}")
	public User helloUser(
			@PathVariable
			String name) {
		return new User("Hello " +name +" !"); 
	}
	
	
}
