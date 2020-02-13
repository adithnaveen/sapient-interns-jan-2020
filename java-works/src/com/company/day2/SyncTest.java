package com.company.day2;

public class SyncTest  implements Runnable{
	private int amount; 
	private Thread thread; 
	private Account account; 
	
	public SyncTest(String name, Account account, int amount ) {
		this.account = account; 
		this.amount = amount; 
		thread = new Thread(this, name); 
		thread.start(); 
	}
	
	
	public static void main(String[] args) {
		
		Account account = new Account(1000); 
		
		new SyncTest("Mr. A", account, 500); 
		new SyncTest("Mr. B", account, 700); 
	}

	@Override
	public void run() {
			account.withDraw(amount);
	}
	
	
	
}
