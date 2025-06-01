package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Sstudent {
	String name;
	List<String> courses;

	Sstudent(String name, List<String> courses) {
		this.name = name;
		this.courses = courses;
	}

	public List<String> getcourses() {
		return courses;
	}
}

public class CoursesbyStudent {

	public static void main(String[] args) {

		List<Sstudent> students = Arrays.asList(
				new Sstudent("Ashish", Arrays.asList("Java", "Spring", "Python", "SQL")),
				new Sstudent("Ashish", Arrays.asList("Math", "Science", "History", "English")),
				new Sstudent("Ashish", Arrays.asList("CoreJava", "SpringBoot", "Mogodb", "Spark")),
				new Sstudent("Ashish", Arrays.asList("AdvJava", "SpringMvc", "Anaconda", "PySpark")));

		List<String> allcourses = students.stream().flatMap(student -> student.getcourses().stream()).sorted()
				.collect(Collectors.toList());
		System.out.println(allcourses);
	}

}
