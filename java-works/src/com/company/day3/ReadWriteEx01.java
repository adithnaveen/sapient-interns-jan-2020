package com.company.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteEx01 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int empId; 
		String empName; 
		double empSal;
		
		BufferedWriter bw = null; 
		try {
			System.out.println("Enter EmpId : ");
			empId = Integer.parseInt(br.readLine());
			
			System.out.println("Enter EmpName : ");
			empName = br.readLine(); 
			
			System.out.println("Enter EmpSal : ");
			empSal = Double.parseDouble(br.readLine()); 
			
			System.out.println("------------------------------------");
			System.out.println("Emp Id " + empId);
			System.out.println("Emp Name " + empName);
			System.out.println("Emp Sal " + empSal);
			
			File file = new File("emp.txt"); 
			 bw = new BufferedWriter(new FileWriter(file));
			
			bw.write("EmpId : " + empId);
			bw.write("EmpName : " + empName);
			bw.write("EmpSal : " + empSal);
			
			System.out.println("Data Saved... ");
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
