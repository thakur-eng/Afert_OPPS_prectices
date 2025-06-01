package com.CollectionFremWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapFindExpencive {

	public static void main(String[] args) {

		Map<String, Integer> bookshop = new HashMap<>();
		bookshop.put("Math", 459);
		bookshop.put("Science", 399);
		bookshop.put("English", 199);
		bookshop.put("Hindi", 140);
		bookshop.put("Physics", 320);
		bookshop.put("Biologoy", 235);

		int max = 0;
		Iterator<Entry<String, Integer>> high = bookshop.entrySet().iterator();

		Integer maxPrice = 0;
		String maxPriceProd = null;
		while (high.hasNext()) {
			Entry<String, Integer> h = high.next();

			System.out.println(h.getKey() + " = " + h.getValue());

			Integer currentprice = h.getValue();
			String currentprod = h.getKey();
			if (currentprice > maxPrice) {
				maxPrice = currentprice;
				maxPriceProd = currentprod;
			}
		}
		
		System.out.println("This is MaxPrice " + maxPriceProd + " " + maxPrice);

	}
}
