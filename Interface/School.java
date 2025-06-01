package com.Interface;

public interface School {

	public abstract void Student();

	void classes();

}

class PlaySchool implements School {

	@Override
	public void Student() {
		System.out.println("PlaySchool.Student()");

	}

	@Override
	public void classes() {
		System.out.println("PlaySchool.classes()");

	}

}

class School1 {
	public static void main(String[] args) {

		PlaySchool s = new PlaySchool();
		s.classes();
		System.out.println(" Collage " + s.hashCode());

	}
}
