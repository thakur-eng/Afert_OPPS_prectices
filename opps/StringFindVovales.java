package com.opps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFindVovales {

	public static void main(String[] args) {

		String s = "ashishoo";
		int count = 0;

		List<Integer> name = new ArrayList<>();
		char[] a = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				name.add(i);
			}
		}

		for (int i = 0, j = count - 1; i < count / 2; i++) {

			char temp = a[name.get(i)];

			a[name.get(i)] = a[name.get(j)];
			a[name.get(j)] = temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
