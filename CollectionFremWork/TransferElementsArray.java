package com.CollectionFremWork;

public class TransferElementsArray {

	public static void main(String[] args) {

		String[] a = { "Ashish", "Prashant", "Kishan", "Pravin" };
		String[] b = { "Rishav", "Ujawal", "Abhishek" };

		String[] merged = new String[a.length + b.length];

		System.arraycopy(a, 0, merged, 0, a.length);

		System.arraycopy(b, 0, merged, a.length, b.length);

		for (String str : merged) {
			System.out.println(str + "  ");
		}
	}
}
