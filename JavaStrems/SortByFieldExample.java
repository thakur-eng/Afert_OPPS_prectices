package com.JavaStrems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByFieldExample {
	
	static class Employee{
		String name;
		int age;
		Employee(String name , int age)
		{
			this.name=name;
			this.age =age;
		}
		
		@Override
		public String toString()
		{
			return name + "("+ age+ ")";
		}
	}

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("Ashish",25),
				new Employee("Ashish",25),
				new Employee("Bikram",29),
				new Employee("Prashant",25),
				new Employee("Dheraj",30),
				new Employee("Pravin",29),
				new Employee("Prakash",35),
				new Employee("Kishant",50),
				new Employee("Ramesh",58),
				new Employee("Ritesh",28));
		
		employees.sort(Comparator.comparing(emp -> emp.name));
		
		System.out.println("Sorted by name:");
		employees.forEach(System.out::println);
	}

}
