package com.CollectionFremWork;

public class StringExists {

	public static void main(String[] args) {

		String s1 = "Dog";
		// char[] chars = s1.toCharArray();
		System.out.println(s1.contains("A"));

		
		
		String s2[] = { "apple", "Bool", "Ashish" };

		for (String s : s2) {
			if (s.toLowerCase().startsWith("a")) {
				System.out.println("this world start with a " + s);
			}
		}
	}

}
