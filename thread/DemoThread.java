package com.thread;

public class DemoThread extends Thread {
	
	@Override
	public void run () {
		System.out.println("hellow ");
		
		for(int i = 0; i<3;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
 
		System.out.println("Main Thread Start ");
		
		Thread t1 = new Thread(new DemoThread());
		t1.start();
		
		System.out.println("End Main Thread ");
		System.out.println("hi");
		System.out.println("by");
	}

}
