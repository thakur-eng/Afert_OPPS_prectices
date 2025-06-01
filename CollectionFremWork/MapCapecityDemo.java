package com.CollectionFremWork;

import java.util.HashMap;
import java.util.Map;

public class MapCapecityDemo {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>(4);
		
		map.put("Ram", "Jha");
		map.put("Shayam", "Mishra");
		map.put("Mohan", "Raj");
		map.put("Rajen", "Kumar");
		map.put("Mohit", "JII");
		
		System.out.println(map);
	}

}
