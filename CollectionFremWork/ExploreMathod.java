package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExploreMathod {

	public static void main(String[] args) {

		// List<String> name = new ArrayList<String>();
		Set<String> name = new HashSet<String>();
		name.add("Ashish");
		name.add("Ram");
		name.add("AA");
		name.add("DD");
		name.add("zz");

		System.out.println(name);

		List<String> nameList = new ArrayList<>(name);

		Collections.sort(nameList);
		System.out.println(name);

		Collections.reverse(nameList);
		System.out.println(name);

		Collections.synchronizedSet(name);
		System.out.println(name);

		Collections.unmodifiableSet(name);
		System.out.println(name);

		//Collections.shuffle(name);
		System.out.println(name);

	}

}
