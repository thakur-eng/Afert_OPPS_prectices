package com.thread;


public class PracticeTask_1 extends Thread {

	@Override
	public void run() {
		System.out.println("Verifying Payment Details" + Thread.currentThread().getName());
	pay();
	}

	public void pay() {
		System.out.println("Initiating Bank Transfer"+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		PracticeTask_1 taksk1 = new PracticeTask_1();

		Thread t1 = new Thread(taksk1);
		t1.start();
		
		PracticeTask_1 taksk2 = new PracticeTask_1();

		Thread t2 = new Thread(taksk2);
		t2.start();

	}

}
