package com.company.day3;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		File file = new File("myfol"); 
		
		System.out.println(file.isDirectory());

		String [] files = file.list(); 

		for(String temp : files) {
			System.out.println(temp);
		}
	}
}

