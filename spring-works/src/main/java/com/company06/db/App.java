package com.company06.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-db.xml");

		IEmployeeDAO iEmployeeDAO = context.getBean("employeeJdbcTemplate", IEmployeeDAO.class);

		Employee employee = new Employee(201, "Naveen", 3434, "naveen@probits.in", 10);

//		System.out.println(iEmployeeDAO.create(employee)?"Inserted" :"Not Inserted");
//		iEmployeeDAO.updateEmployee(101, 10000); 

//		iEmployeeDAO.deleteEmployee(101);

//		System.out.println(iEmployeeDAO.getEmployee(102));
		
		iEmployeeDAO.getAllEmployees().forEach(x -> System.out.println(x));
		System.out.println("--------------------------------------");
		iEmployeeDAO.getAllEmployees().forEach(System.out :: println);
	}
}
