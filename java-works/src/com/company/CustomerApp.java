package com.company;

public class CustomerApp {

	public static void main(String[] args) {
		Customer  customer  = new Customer(); 

		
		
		customer.setCustomerId(101);
		customer.setCustomerIncome(333);
		customer.setCustomerName("sri");
		
		show(customer);
		
		
		
		System.out.println("--------------------------------");
		customer.display(); 
	}

	private static void show(Customer customer) {
		System.out.println("Cust Id " + customer.getCustomerId());
		System.out.println("Cust Name " + customer.getCustomerName());
		System.out.println("Cust Income " + customer.getCustomerIncome());
	}
	
	
}
