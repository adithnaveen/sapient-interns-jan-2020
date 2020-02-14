package com.company.day2;

// by extending the class from Thread class you notify JVM + OS that 
// a new parallel job is start()  
class BusinessLogic extends Thread {

	@Override
	public void run() {
		System.out.println("run() - Started " + Thread.currentThread().getName());
		for (int i = 0; i <= 600; i++) {
			System.out.println("Value of i in " + Thread.currentThread().getName() + " is " + i);
		}

		System.out.println("Exiting Thread: " + Thread.currentThread().getName());

	}

}

public class ThreadEx01 {
	// if the class has main mehtod then it is the first thread
	public static void main(String[] args) {
		System.out.println("Thread name  " + Thread.currentThread().getName());
		// 1 min, 10 max, 5 norm (default)
		System.out.println("Thread Priority  " + Thread.currentThread().getPriority());

		BusinessLogic bl = new BusinessLogic();
		// will create the thread and does OS jobs + invoke run() 
		// implicitly, its async, output is not predictable. 
		bl.start(); 

		
		BusinessLogic bl1 = new BusinessLogic(); 
		bl1.setName("Pavan");
		bl1.setPriority(Thread.MAX_PRIORITY);
		bl1.start();
		
		BusinessLogic bl2 = new BusinessLogic(); 
		bl2.setName("Sharath");
		bl2.setPriority(bl1.getPriority() -1 );
		bl2.start(); 
		
		
		
		//////////////////////////////////////////////////

		System.out.println("run() - Started " + Thread.currentThread().getName());
		for (int i = 0; i <= 600; i++) {
			System.out.println("Value of i in " + Thread.currentThread().getName() + " is " + i);
		}
		
		
		
		try {
			bl.join();
			bl1.join();
			bl2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		

		System.out.println("Exiting Thread: " + Thread.currentThread().getName());
		//////////////////////////////////////////////////////////////

		System.out.println("some BL... ");

	}
}
