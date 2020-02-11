package com.company04.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Mobile mobile = context.getBean("mobile", Mobile.class); 
		
		System.out.println(mobile.getCamera());
		System.out.println(mobile.getDisplay());
		System.out.println(mobile.getSpeaker());

	}
}
