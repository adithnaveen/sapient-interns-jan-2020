package com.company.day2;

public class Account {
	int balance; 
	// simulating the data is taken from Db 
	public Account(int balance) {
		this.balance = balance; 
	}
	
	public synchronized void withDraw(int amount) {
		if(amount < balance) {

			// killing some time 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			balance = balance - amount; 
			System.out.println("Amount withdrawn of " + amount + " by " + 
					Thread.currentThread().getName() +"Your Current Balance is " + balance);
		}else {
			System.out.println("Sorry Mr/Ms/Mrs: " + 
					Thread.currentThread().getName() +
					", Requested Amount Not Available for   :" 
					+ amount);
			System.out.println("Your Current Balance is " + balance);
		}
	}
	
}
