package com.company02.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class); 
		
		Greeting greeting = context.getBean("english", Greeting.class);
		
		System.out.println(greeting.sayHello());
		
	}
}
