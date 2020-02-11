package com.company.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

// split stream
public class StreamEx02 {
	public static void main(String[] args) throws IOException {
		//a,b,c,d,e
		// a:b:c:d:e
		
		String readLine ="a,b,c,d,e"; 
		Pattern pattern = Pattern.compile(","); 
		
		pattern.splitAsStream(readLine)
			.forEach(System.out :: println);

	
		System.out.println("===========================================");
		
		//reading the data from file 
		
		Pattern filePattern = Pattern.compile(":"); 
		
		try (Stream<String> string = Files.lines(Paths.get("emp.txt"))){
			
			string.forEach( t -> 	
					filePattern.splitAsStream(t).forEach(System.out :: println)); 
		}

	
	}
}
