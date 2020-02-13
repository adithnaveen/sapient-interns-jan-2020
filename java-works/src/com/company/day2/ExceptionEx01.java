package com.company.day2;

public class ExceptionEx01 {
	public static void main(String[] args) {

		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			try {
				int[] arr = new int[-4];
			} catch (NegativeArraySizeException nase) {
				nase.printStackTrace();
			}

			int result = num1 / num2;

			System.out.println("Result is " + result);

			return; 
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			//100% execute 
			System.out.println("Hey i'm from finally... i'm always there... ");
		}

		System.out.println("I'm other business logic... ");
	}
}
