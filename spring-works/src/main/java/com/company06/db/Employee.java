package com.company06.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


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
	
	public Employee(int empId, String empName, double empSal, String empEmail, int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
		this.deptId = deptId;
	} 
	
	
	
}
