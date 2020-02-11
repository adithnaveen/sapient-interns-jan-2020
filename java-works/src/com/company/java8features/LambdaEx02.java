package com.company.java8features;

// math operation 
public class LambdaEx02 {
	public static void main(String[] args) {

		// you implementation
		MathOperation add = (a, b) -> {return a + b; } ;
		MathOperation sub = (a, b) -> a - b;
		MathOperation mul = (a, b) -> a * b;
		MathOperation div = (a, b) -> a / b;

		System.out.println(add.operation(10, 20));
		System.out.println(sub.operation(10, 20));
		System.out.println(mul.operation(10, 20));
		System.out.println(div.operation(10, 30));
		
		System.out.println(operate(100, 200, add));  
		
	}

	
	private static int  operate(int a, int b, MathOperation operationType) {
		return operationType.operation(a, b); 
	}
	
	
}
