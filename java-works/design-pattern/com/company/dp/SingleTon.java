package com.company.dp;


class Company{
	
	private  Company() {
		System.out.println("hi company object created... ");
	}
	
	public static Company getInstance(Company company){
		if(company == null) {
			return new Company();  
		}
		return company; 
	}
	
}


public class SingleTon {
	public static void main(String[] args) {
		Company company = null; 
		company = Company.getInstance(company); 
		
		
		Company company1 =  Company.getInstance(company);  
		Company company2 = Company.getInstance(company1); 
		
		
		System.out.println("@ " + company.hashCode());
		System.out.println("@ " + company1.hashCode());
		System.out.println("@ " + company2.hashCode());
		
		
	}
}
