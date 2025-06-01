package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection8 {

	public static void main(String[] args) {

		Set<String> name = new HashSet<>();

		name.add("Ashish");
		name.add("Vikash");
		name.add("Thakur");
		name.add("Ashish");
		name.add("Vikash");
		name.add("Thakur");

		System.out.println("Set block thare Name is not dublicte " + name);

		List<String> Name = new ArrayList<String>();

		Name.add("Ashish");
		Name.add("Vikash");
		Name.add("Thakur");
		Name.add("Ashish");
		Name.add("Vikash");
		Name.add("Thakur");

		System.out.println("List block thare Name is not dublicte " + Name);

	}

}
