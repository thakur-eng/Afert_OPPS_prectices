package com.JavaStrems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Department_AverageSalary_Example {

	
 
		static class Employee 
		{
			String name;
			String department;
			double salary;
			
			Employee(String name,String department,double salary)
			{
				this.name = name;
				this.department =department;
				this.salary = salary;
			}
		}
		public static void main(String[] args) {
			
			List<Employee> employees = Arrays.asList(new Employee("Ashish","IT",90000),
					new Employee("Ashish","IT",90000),
					new Employee("Prashant","IT",70000),
					new Employee("Rishav","IT",120000),
					new Employee("Pravin","IT",55000),
					new Employee("Nilu","HR",35000),
					 new Employee("Nikita", "HR", 55000),
					new Employee("Sofiya","FD",20000),
					new Employee("Ritesh", "FD", 22000),
					new Employee("Ravilal","IT",15000));
			
			Map<String,Double> avgSalryByDept = employees.stream()
					.collect(Collectors.groupingBy(emp -> emp.department,
							Collectors.averagingDouble(emp ->emp.salary)));
			
			avgSalryByDept.forEach((dept,avgSalary) ->System.out.println(dept + " :"+ avgSalary));
					
	}
}
