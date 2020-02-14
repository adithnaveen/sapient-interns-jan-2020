package com.company.day2;


class NameTooShortException extends Exception {
	private String message;

	public NameTooShortException() {
		this.message = "Sorry Name too short";
	}

	public NameTooShortException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NameTooShortException [message=" + message + "]";
	}
}


// by extending the class from Exception class,
// you give an opportunity to throw that class 
class MinimalSalaryException extends Exception {

	private String message;

	public MinimalSalaryException() {
		this.message = "Sorry minimum salary";
	}

	public MinimalSalaryException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MinimalSalaryException [message=" + message + "]";
	}
}

public class ExceptionEx02 {
	
	
	public static void checkName(String name) throws NameTooShortException {
		if(name.length() < 5) {
			throw new NameTooShortException("Name too short for " + name);
		}
	}
	public static void processIncomeTax(String name, int salary)
		throws MinimalSalaryException, Exception {
		try {
			checkName(name);
			
			if (salary < 10000) {
	
				throw new RuntimeException("Sorry Invalid Salary for Mr/Ms/Mrs: " + name);
			} else if (salary >= 10000 && salary < 20000) {
				throw new MinimalSalaryException("Sorry Minimum Salary given of "
							+ salary + " for Mr/Ms/Mrs:" + name);
			} else {
				System.out.println("Thank you your IT returns are being filed Mr/Ms/Mrs: " + name);
			}
		}catch(NameTooShortException ntse) {
			throw new Exception("Sorry income not processed", ntse); 
		}
	}

	public static void main(String[] args) { //  throws MinimalSalaryException {
		
		try {
			processIncomeTax("San", 10000);
		}catch(MinimalSalaryException mse) {
			System.out.println(mse); // -> System.out.println(mse.toString()); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Some other business logic... ");
	}
}











