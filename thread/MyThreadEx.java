package com.thread;

public class MyThreadEx extends Thread {

	public void run() {
		for(int i = 1; i <=5; i++) {
			System.out.println("Chiled Thread "+ i);
		}
	}
	
	
	public static void main(String[] args) {
		
		MyThreadEx t = new  MyThreadEx();
		t.start();
		
		for(int i = 1; i <=5; i++) {

		System.out.println("Main Thread "+ i); 
 
	}

  }
}
