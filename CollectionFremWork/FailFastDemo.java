package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;

public class FailFastDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ram ji ");
		list.add("Hanuman ji ");
		list.add("Shiv ji ");

		for (String s : list) {
			System.out.println(s);
			list.add("Brhma ji ");

		}
	}
}
