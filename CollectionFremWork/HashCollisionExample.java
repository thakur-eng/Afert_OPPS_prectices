package com.CollectionFremWork;

import java.util.*;

class Student {
	int id;

	Student(int id) {
		this.id = id;
	}

		@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.id == s.id;
	}

	@Override
	public String toString() {
		return "Student ID:" + id;
	}
}

public class HashCollisionExample {

	public static void main(String[] args) {

		HashSet<Student> students = new HashSet<>();

		Student s1 = new Student(101);
		Student s2 = new Student(102);

		students.add(s1);
		students.add(s2);

		for (Student s : students) {
			System.out.println(s);
		}
	}

}
