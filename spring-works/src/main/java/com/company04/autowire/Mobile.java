package com.company04.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

//@Configuration
//@ComponentScan
@Component
public class Mobile {
	
	
	@Autowired
	private Camera camera; 
	@Autowired(required = true)
	private Speaker speaker; 
	@Autowired
	private Display display; 
}
