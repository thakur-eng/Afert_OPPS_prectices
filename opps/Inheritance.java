package com.opps;

public class Inheritance {

	public static void main(String args[]) {
		System.out.println("Start");

		Collage college = new Collage();
		college.chiled();

		Hostal h = new Hostal();
		h.Student();
	}
}

class Collage extends Inheritance {
	public void chiled() {
		System.out.println("come heare");
	}
}

class Hostal extends Inheritance {
	public void Student() {
		System.out.println("complited");

	}

}
