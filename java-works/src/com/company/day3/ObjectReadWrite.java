package com.company.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

	public static void storeAccount(Account... accounts) throws IOException {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("Accounts.ser"));

			oos.writeObject(accounts);
			oos.writeObject(101);
			oos.writeObject("Sapient");
			System.out.println("Object saved...");
		} catch (IOException e) {

			throw new IOException("Sorry storage failed", e);
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public static void readAccount() {
		
		ObjectInputStream  ois= null; 
		
		try {
			ois = new ObjectInputStream(new FileInputStream("Accounts.ser"));
			
			Account [] accounts = (Account[]) ois.readObject(); 
			
			for(Account temp: accounts) {
				System.out.println(temp);
			}
			
			int x = (int) ois.readObject(); 
			System.out.println(x);
			String str = (String) ois.readObject();
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException cce) {
			cce.printStackTrace(); 
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	

	public static void main(String ... args) {

		Account account = new Account(101, 1234, "Harry");
		Account account1 = new Account(102, 3333, "Peter");

//		try {
//			storeAccount(account, account1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		readAccount();
	}
}
