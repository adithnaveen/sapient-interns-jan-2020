package com.company01.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		IHelloService service = context.getBean("hello", IHelloService.class);
		IHelloService service1 = context.getBean("hello", IHelloService.class);
		IHelloService service2 = context.getBean("hello", IHelloService.class);
		
		
		System.out.println(service.sayHello());
		System.out.println(service1.sayHello());
		System.out.println(service2.sayHello());
		
	}
}
