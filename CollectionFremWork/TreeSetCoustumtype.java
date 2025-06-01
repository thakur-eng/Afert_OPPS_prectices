package com.CollectionFremWork;

import java.util.Iterator;
import java.util.TreeSet;

class State implements Comparable<State> {
	String name;

	public State(String name) {
		this.name = name;

		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	public String toString() {
		return name;
	}

}

public class TreeSetCoustumtype {

	private static final boolean State = false;

	public static void main(String[] args) {

		TreeSet<State> stu = new TreeSet<State>();
		stu.add(new State("Bihar"));
		stu.add(new State("Odisha"));
		stu.add(new State("Karnatka"));
		stu.add(new State("Bangal"));
		stu.add(new State("Bihar"));
		stu.add(new State("Panjab"));
		stu.add(new State("Tamillandu"));
		stu.add(new State("Delhi"));
		stu.add(new State("Rajshathan"));
		stu.add(new State("MadhyPradesh"));

		System.out.println(stu);

		Iterator<State> st = stu.iterator();
		while (st.hasNext()) {

			System.out.println("State : " + st.next());
		}

	}
}
