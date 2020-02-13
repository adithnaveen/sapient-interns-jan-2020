package com.company.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		readFile();

	}

	private static boolean readFile() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		return true;
	}
}
