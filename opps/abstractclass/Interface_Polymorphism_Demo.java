package com.opps.abstractclass;

interface Vehicle{
	void start();
	void  stop();
}

class Bike implements Vehicle{

	@Override
	public void start() {
 System.out.println("Bike Started");		
	}

	@Override
	public void stop() {
		 System.out.println("Bike Stoped");
		
	}
	
}

class Care implements Vehicle{

	@Override
	public void start() {
		 System.out.println("Car Started ");
		
	}

	@Override
	public void stop() {
		 System.out.println("Car Stoped");
		
	}
	
}


public class Interface_Polymorphism_Demo {

	public static void main(String[] args) {
 
		Vehicle v1= new Bike();
		v1.start();
		v1.stop();
		
		Vehicle v2 = new Care();
		v2.start();
		v2.stop();
	}

}






 