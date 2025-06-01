package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;

class Empoloyee {
	String name;

	Empoloyee(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Employee Name :" + name);
	}
}

public class Collection7 {

	public static void main(String[] args) {

		List<Empoloyee> empolyee = new ArrayList<Empoloyee>();

		empolyee.add(new Empoloyee("Ashish"));
		empolyee.add(new Empoloyee("Vipen "));
		empolyee.add(new Empoloyee("Prashant "));
		empolyee.add(new Empoloyee("Kishan"));
		empolyee.add(new Empoloyee("Rishav"));
		empolyee.add(new Empoloyee("Abhishek"));

		for (Empoloyee emp : empolyee) {

			emp.display();
		}

	}
}
