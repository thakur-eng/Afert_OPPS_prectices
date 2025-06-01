package com.thread;

public class ThreadExm 


extends Thread {

	public void run() {
		System.out.println("hellow ");
	}
	
	public static void main(String[] args) {
 
		System.out.println("Main Metod :- " + Thread.currentThread().getName());
		
		Thread t1 = new Thread(new ThreadExm());
		t1.start();
		System.out.println("End Main Method :- " + Thread.currentThread().getName());
		System.out.println("Welcome to thread ");
	}

}
 