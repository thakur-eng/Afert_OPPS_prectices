package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	public String getName() {
		return name;
	}

	public int getmarks() {
		return marks;
	}

}

public class Student_List_Pass {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Ashish", 19), new Student("Prashant", 34),
				new Student("Shiva", 33), new Student("Ritesh", 30), new Student("Rishav", 31),
				new Student("Ujuwal", 22), new Student("Sahid", 25), new Student("Abhishek", 18));

		List<String> passStudents = students.stream().filter(s -> s.getmarks() >= 30).map(Student::getName)
				.collect(Collectors.toList());

		System.out.println("All Top Students :" + passStudents);

	}  

}
