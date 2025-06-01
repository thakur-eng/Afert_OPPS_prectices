package com.CollectionFremWork;

import java.util.LinkedList;
import java.util.List;

public class Collage {

	public static void main(String[] args) {

		List<String> students = new LinkedList<>();
		students.add("Ashish");
		students.add("Prashant");
		students.add("Rishav");
		students.add("Ritesh");
		students.add("Sofiya");
		students.add("Abhishek");
		students.add("Kishan");
		students.add("Pravin");
		students.add("Ujawal");
		students.add("Rishu");
		students.add("Dheraj");
		students.add("Vikash");
		students.add("Ramu");
		students.removeFirst();
		students.removeLast();

		System.out.println(students);

		for (String str : students) {
			
			System.out.println(str);
		}

	}
}
