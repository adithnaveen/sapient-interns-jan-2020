package com.company.java8features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(
				FileReader fileReader = new FileReader("emp.txt"); 
				BufferedReader br = new BufferedReader(fileReader); 
				){
			
			br.lines().forEach(System.out :: println);
		}
		///////////////////////////////////////////////////
		
		//only with streams 
		
		try(Stream<String> string = Files.lines(Paths.get("emp.txt"))){
			string.forEach(System.out :: println);
		}
		
	}
}
