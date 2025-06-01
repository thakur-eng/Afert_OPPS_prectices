package com.opps.encapsulation;

class Student {
	private String name;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Invalid marks.Must be between 0 and 100.");

		}
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
}

public class StudentRecordSystem {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Ashish");
		s.setMarks(90);
		System.out.println(s.getName() + " scored " + s.getMarks());

	}

}
