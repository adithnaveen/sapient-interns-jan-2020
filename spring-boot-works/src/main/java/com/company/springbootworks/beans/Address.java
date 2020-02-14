package com.company.springbootworks.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String houseNo; 
	private String street; 
	private String city; 
	private String country; 
}
