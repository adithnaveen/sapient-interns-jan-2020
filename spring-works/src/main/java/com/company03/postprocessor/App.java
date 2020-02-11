package com.company03.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext
				("applicationContext.xml", "applicationContext2.xml"); 
		
		ApplicationContext myNewContext = new ClassPathXmlApplicationContext
				(new String [] {"anotherContext.xml"}, context); 
		
		
		
		Employee bean = context.getBean("emp", Employee.class); 
		
		System.out.println(bean);
	}
}
