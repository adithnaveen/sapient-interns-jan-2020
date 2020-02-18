package com.naveen.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private int empId; 
	private String empName; 
	private double empSal; 
	private String empEmail; 
	private int deptId; 
}
