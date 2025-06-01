package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_department {
	
	static class Employee{
		
		String name ;
		String departmant;
		
		Employee(String name,String departmant )
		{
			this.name=name;
			this.departmant = departmant ;
			
		}
		
		@Override
		public String toString()
		{
			return name;
		}
	}

	public static void main(String[] args) {
 
		List<Employee> employees = Arrays.asList(
		
		new Employee("Ashish","IT"),
		new Employee("Prashant","IT"),
		new Employee("Abhishek","IT"),
		new Employee("Mukesh","CA"),
		new Employee("Rahul","HR"),
		new Employee("Niliu","HR"),
		new Employee("Ritesh","IT"),
		new Employee("Sivu","HR"));
		
		Map<String,List<Employee>> groupedByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.departmant));
		
		groupedByDept.forEach((dept, empList) -> {
			System.out.println(dept + ": "+ empList );
		});
		
		
		
		
	}
}

 