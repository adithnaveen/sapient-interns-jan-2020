package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SorterStudent {

	public static Student[] ascStudentName(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o2.getsName().compareTo(o1.getsName());
			}
		});
		return students;
	}

	public static Student[] descStudentName(Student[] students) {
		Arrays.sort(students, (o1, o2) -> o1.getsName().compareTo(o2.getsName()));
		return students;
	}

	public static Student[] ascStudentId(Student[] students) {
		Arrays.sort(students, (o1, o2) -> o1.getsId() - o2.getsId());
		return students;
	}

	public static Student[] descStudentId(Student[] students) {
		Arrays.sort(students, (o1, o2) -> o2.getsId() - o1.getsId());
		return students;

	}
}
