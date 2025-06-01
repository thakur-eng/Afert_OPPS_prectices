package com.CollectionFremWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Ashish");
		map.put(2, "Prashant");
		map.put(3, "Abhishek");
		map.put(4, "Rishav");

		System.out.println("Name: " + map.get(1));

		System.out.println("Name: " + map.get(2));

		System.out.println("Name: " + map.get(3));

		System.out.println("Name: " + map.get(4));

		map.put(4, "Kishan");
		System.out.println("Name: " + map.get(4));

		System.out.println("Prashant Name is  availabe -> " + map.containsValue("Prashant"));
		System.out.println("Prashant  Number is  availabe -> " + map.containsKey(2));

		map.remove(3);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}

		for (Integer key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Use Iterator ==" + entry.getKey() + " " + entry.getValue());
		}

	}

}
