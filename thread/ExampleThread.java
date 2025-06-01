package com.thread;

public class ExampleThread extends Thread {

	public void doSomething() {
		System.out.println("doSomething method ");
	}

	public void run() {
		System.out.println("this is run class chiled ");
		doSomething();
	}

	public static void main(String[] args) {

		System.out.println("Hellow Ji   :" + Thread.currentThread().getName());
		System.out.println("Main Method :" + Thread.currentThread().getName());

		ExampleThread flow = new ExampleThread();
		Thread t1 = new Thread(flow);
		t1.start();

		flow.doSomething();
		System.out.println("Main End  ");
	}

}
