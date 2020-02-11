package com.company;

public class TestClassforName {
	public static void main(String[] args) {
		try {
			Class.forName("com.classname.ClassForNameEx");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
