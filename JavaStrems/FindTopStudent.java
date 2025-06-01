package com.JavaStrems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
	String name;
	int mark;

	Student1(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return name + " (" + mark + ")";
	}
}

public class FindTopStudent {

	public static void main(String[] args) {

		List<Student1> list = Arrays.asList(new Student1("Prashant", 400), new Student1("Ashish", 424),
				new Student1("Rishav", 234), new Student1("Pankaj", 405), new Student1("Ritesh", 103),
				new Student1("Pravin", 600));

		//List<Student1>  s1 = 
		 list.stream().filter(n -> n.mark > 80).sorted(Comparator.comparingInt((Student1 s) -> s.mark).reversed())
		.forEach(System.out::println);
		//.collect(Collectors.toList());
		//System.out.println(s1);
	}

}
