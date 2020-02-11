package com.company03.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeeBeanProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName)
				throws BeansException {
		System.out.println("EmployeeBeanProcessor:postProcessBeforeInitialization " + beanName);
		
		if(bean instanceof Employee) {
			Employee emp = (Employee) bean; 
			emp.setEmail(emp.getEmail().toUpperCase());
			
			return emp; 
			
		}
		
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) 
				throws BeansException {
		System.out.println("EmployeeBeanProcessor:postProcessAfterInitialization " + beanName);
		return bean;
	}
	
}
