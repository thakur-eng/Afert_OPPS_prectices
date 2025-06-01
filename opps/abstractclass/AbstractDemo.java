package com.opps.abstractclass;

abstract class Vahicle {
	abstract void start();

	void stop() {
		System.out.println("Vehicle stopped");
	}
}

class Car extends Vahicle {

	@Override
	void start() {
		System.out.println("Car started");
	}

}

class AbstractDemo {

	public static void main(String[] args) {

		Vahicle a = new Car();

		a.start();
		a.stop();

	}

}
