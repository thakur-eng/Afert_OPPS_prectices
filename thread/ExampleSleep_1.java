package com.thread;

public class ExampleSleep_1 extends Thread  {
	
	@Override
	public void run() {
		System.out.println("Hellow wellcome to Kodewala");
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		man();
	}
	
	void man() {
		System.out.println("man is hendal all this ");
	}

	public static void main(String[] args) {
 
		Thread t1 = new Thread(new ExampleSleep_1());
		t1.start();
	}

}
