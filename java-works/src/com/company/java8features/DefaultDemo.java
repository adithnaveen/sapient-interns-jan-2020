package com.company.java8features;

interface IFirst {
	public void hi();

	default void logs() {
		System.out.println("Hi log from First ");
	}

	// you can access because in java you dont have to create
	// an object of the class or interface to access
	public static void callMeFirst() {

	}
}

interface ISecond {
	default void logs() {
		System.out.println("Hi log from Second");
	}
}

class MyJob implements IFirst, ISecond {
	public void logs() {
		System.out.println("hi this log is from myjob");
	}
	
	public void hi() {
		System.out.println("hi from hi ");
	}
}

public class DefaultDemo {
	public static void main(String[] args) {
		IFirst.callMeFirst();
	}
}
