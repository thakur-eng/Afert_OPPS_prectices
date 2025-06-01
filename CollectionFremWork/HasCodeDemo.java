package com.CollectionFremWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Empolyee {
	String name;

	public Empolyee(String _name) {
		this.name = _name;
	}

	@Override
	public int hashCode() {
		System.out.println("in side hashCode ");

		return 1233332;
	}
}

public class HasCodeDemo {

	public static void main(String[] args) {

		Set<Empolyee> name = new HashSet<Empolyee>();
		name.add(new Empolyee("Ashish"));
		name.add(new Empolyee("Prashant"));
		name.add(new Empolyee("Ritesh"));
		name.add(new Empolyee("Rishav"));
		name.add(new Empolyee("Prashan1t"));
		name.add(new Empolyee("Ritesh2"));
		name.add(new Empolyee("Rishav3"));
		name.add(new Empolyee("Rishav4"));
    

		System.out.println(name);
		System.out.println("Ashish");
	}

}
