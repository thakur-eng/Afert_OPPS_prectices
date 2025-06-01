package com.Interface;

interface BonusCalculator{
	double claculateBonus(double salary);
}

class Employee{
	String name;
	double salary;
	Employee(String name, double salary){
		this.name=name;
		this.salary= salary;
	}
}


public class EmployeManager {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Ashish",90000);
		
		BonusCalculator bonus = (salary) -> salary *0.10;
		
		double bounusAmount = bonus.claculateBonus(emp.salary);
		
		System.out.println("Employe name :" + emp.name);
		System.out.println("Bonus rs : "+ bounusAmount);
 
	}

}
