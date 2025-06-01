package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection10 {

	public static void main(String[] args) {

		List<String> emp = new ArrayList<>();

		emp.add("Ashish Kuamar Thakur ");
		emp.add("Vipen jee ");
		emp.add("Abhishek ");
		emp.add("Sofiya");
		emp.add("Ashish Kuamar Thakur ");
		emp.add("Vipen jee ");
		emp.add("Abhishek ");
		emp.add("Sofiya");

		for (String str : emp)

			System.out.println("This my Emp Name :" + str);

		List<Integer> age = new ArrayList<>();

		age.add(25);
		age.add(35);
		age.add(27);
		age.add(30);
		age.add(25);
		age.add(35);
		age.add(30);

		for (Integer inter : age)

			System.out.println("This my Emp Age :" + inter);

		System.out.println("-----------------------------------------------------------------------------");

		Set<String> name = new HashSet<>();

		name.add("Ashish Kuamar Thakur ");
		name.add("Vipen jee ");
		name.add("Abhishek ");
		name.add("Sofiya");
		name.add("Ashish Kuamar Thakur ");
		name.add("Vipen jee ");
		name.add("Abhishek ");
		name.add("Sofiya");

		for (String str : name)

			System.out.println("This my Emp Name :" + str);

		Set<Integer> Age = new HashSet<>();

		Age.add(25);
		Age.add(35);
		Age.add(27);
		Age.add(30);
		Age.add(25);
		Age.add(35);
		Age.add(30);

		for (Integer inter : Age)

			System.out.println("This my Emp Age :" + inter);

	}

}
