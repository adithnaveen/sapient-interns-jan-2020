package com.company.day3;

import java.io.File;
import java.io.IOException;

public class FileOpr {
	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt"); 
		

		if(file.exists()) {
			System.out.println("File exists");
			
			System.out.println("Modified  : "  + file.lastModified());
			System.out.println("Can Read : " + file.canRead() );
			System.out.println("Can Write :" + file.canWrite());
			System.out.println("Is File " + file.isFile());
			System.out.println("Abosolute Path : "  + file.getAbsolutePath());
			
		}else {
			System.out.println("File does not exists so creating... ");
			file.createNewFile(); 
		}
		
	}
}
