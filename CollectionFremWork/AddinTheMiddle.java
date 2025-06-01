package com.CollectionFremWork;

import java.util.ArrayList;

public class AddinTheMiddle {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();

		animal.add("Dog");

		animal.add("Cow");

		animal.add("Elephent");

		animal.add(2, "Rat");
		
		animal.add(0, "Cat");
		

		System.out.println("This Animal is avilabe in  Vantara : " + animal.get(0));

		System.out.println("This Animal is avilabe in  Vantara :" + animal.get(1));

		System.out.println("This Animal is avilabe in  Vantara :" + animal.get(2));
		
		System.out.println("This Animal is avilabe in  Vantara :" + animal.get(3));

	}

}
