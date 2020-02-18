package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StudentSorter {
	public static void main(String[] args) {
		Student students [] = {
				new Student(101, "Anjana", 77), 
				new Student(55, "Yateesha", 66), 
				new Student(23, "Sanjana", 68), 
				new Student(123, "Shiva", 86),  
				new Student(77, "Saahil", 71)  
		}; 
		
		for(Student s : students) {
			System.out.println(s.getsId() +", " + s.getsName() +", " + s.getsPercentage());
		}

		Arrays.sort(students); 

		System.out.println("-------------------------------------");
		
		for(Student s : students) {
			System.out.println(s.getsId() +", " + s.getsName() +", " + s.getsPercentage());
		}

		
		
		Comparator<Student> descOrderByName = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

					return o2.getsName().compareTo(o1.getsName()); 
			}
			
		};

		
		Arrays.sort(students, descOrderByName);
		

		System.out.println("----------------descOrderByName---------------------");
		
		for(Student s : students) {
			System.out.println(s.getsId() +", " + s.getsName() +", " + s.getsPercentage());
		}

		
		
		
		for(Student temp: SorterStudent.ascStudentId(students)) {
			System.out.println(temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






















