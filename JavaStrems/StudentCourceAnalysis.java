package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Stu {
	String name;
	List<String> courcess;

	Stu(String name, List<String> courcess) {
		this.name = name;
		this.courcess = courcess;
	}

	public String getName() {
		return name;
	}

	public List<String> getCourcess() {
		return courcess;
	}
}

public class StudentCourceAnalysis {

	public static void main(String[] args) {

		List<Stu> students = Arrays.asList(new Stu("Ashish", Arrays.asList("Java", "Spring")),
				new Stu("Tejas", Arrays.asList("Java", "SQL")), new Stu("Kishan", Arrays.asList("Java", "DS")),
				new Stu("Prashant", Arrays.asList("Java", "SpringBoot")),
				new Stu("Rishav", Arrays.asList("Java", "All")));

		List<String> uniq = students.stream().flatMap(stu -> stu.getCourcess().stream()).distinct()
				.collect(Collectors.toList());

		System.out.println("uniq Courcess" + uniq);

		Map<String, Long> courseCount = students.stream().flatMap(student -> student.getCourcess().stream())
				.collect(Collectors.groupingBy(course -> course, Collectors.counting()));

		System.out.println("Course Count: " + courseCount);

		Map<String, Integer> studentCourseCount = students.stream()
				.collect(Collectors.toMap(Stu::getName, student -> student.getCourcess().size()));

		System.out.println("Student Course Count: " + studentCourseCount);

	}

}
