package com.CollectionFremWork;

import java.util.LinkedList;

public class WhareHouse {

	public static void main(String[] args) {

		LinkedList<String> products = new LinkedList<>();

		products.add("MobilePhone ");
		products.add("Laptop");
		products.add("Dextop");
		products.add("LinaxSystem");
		products.add("Mackbook");
		products.add("Ipad");
		products.add("Televisions");
		products.add("various accessories");
		products.add("audio systems");
		products.add("home appliances");

		System.out.println(products);

		for (String str : products) {
			System.out.println("Your Item List : "+str);
		}

	}

}
