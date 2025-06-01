package com.thread;

public class ExampleThread_1 extends Thread {

	void cat() {
		System.out.println("Cat is crying :"+ Thread.currentThread().getName());
	}

	void dog() {
		System.out.println("Dog is crying :"+ Thread.currentThread().getName());
	}

	void man() {
		System.out.println("Man is controling both cat and dog :"+ Thread.currentThread().getName());
		cat();
		dog();
	}

	public void run() {
		System.out.println("This is run man method :"+ Thread.currentThread().getName());
		man();
	}

	public static void main(String[] args) {

		System.out.println("Hellow :" + Thread.currentThread().getName());
		System.out.println("Welcome to Thread :"+ Thread.currentThread().getName());
		ExampleThread_1 check = new ExampleThread_1();
		
		Thread t1 = new Thread(new ExampleThread_1());

		t1.start();

		check.man();
		System.out.println("End of Thread :"+ Thread.currentThread().getName());
	}

}
