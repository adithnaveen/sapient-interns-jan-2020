package com.company.day2;

class OtherBusinessLogic {}

class SomeBusinessLogic extends OtherBusinessLogic implements Runnable{

	private Thread thread; 
	
	public SomeBusinessLogic() {}
	
	public SomeBusinessLogic(String name, int priority) {
		
		
		thread = new Thread(this);
		thread.setName(name);
		thread.setPriority(priority); 
		
		thread.start(); 
	}	
	
	@Override
	public void run() {
		System.out.println("run() - Started " + Thread.currentThread().getName());
		for (int i = 0; i <= 600; i++) {
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Value of i in " +
					Thread.currentThread().getName() + " is " + i
					+" Priority " + Thread.currentThread().getPriority());
		}
		System.out.println("Thread Exiting " + Thread.currentThread().getName());
	}
}

// to show working of runnable interface 
public class ThreadEx02 {
	public static void main(String[] args) {
		
		
		SomeBusinessLogic sbl1 = new SomeBusinessLogic("Mobile", 6); 
		SomeBusinessLogic sbl2 = new SomeBusinessLogic("Monitor", 7); 
		SomeBusinessLogic sbl3 = new SomeBusinessLogic("Laptop", 8); 
		
		
		
		Thread th1 = new Thread(new SomeBusinessLogic(), "Bottle"); 
		th1.setPriority(10);
		th1.start(); 
		
		
	}
}




