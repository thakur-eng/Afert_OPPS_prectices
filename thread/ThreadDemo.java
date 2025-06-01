package com.thread;

public class ThreadDemo extends Thread

{
	@Override
	public void run() {
		System.out.println(" We are working for a compny ");
		System.out.println("Before you do this work check onece ");
	}

	public static void main(String[] args) {

		System.out.println("Main Method is satrt heare ");

		Thread t1 = new Thread(new ThreadDemo());
		t1.start();

		System.out.println("Start working heare ");
		System.out.println("First we Start add element ");
		System.out.println("Second we Start add Price ");

	}

}
