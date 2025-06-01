package com.CollectionFremWork;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name); // Sort by name
	}

	@Override
	public String toString() {
		return name;
	}
}

public class TreeSetAssending {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println(num);
		System.out.println(num.reversed());

		TreeSet<Employee> emp = new TreeSet<>(); // costum type // ? genric use
		emp.add(new Employee("As"));
		emp.add(new Employee("AA"));

		System.out.println(emp);

		
		
	}

}
