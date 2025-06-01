package com.CollectionFremWork;

import java.util.HashSet;
import java.util.Set;

public class Collection9 {

	public static void main(String[] args) {

		Set<Integer> age = new HashSet<>();

		age.add(23);
		age.add(50);
		age.add(50);
		age.add(40);
		age.add(40);

		System.out.println(age);

		Set<Boolean> yesno = new HashSet<>();
		yesno.add(true);
		yesno.add(true);
		yesno.add(false);
		yesno.add(true);
		yesno.add(false);

		System.out.println(yesno);

	}

}
