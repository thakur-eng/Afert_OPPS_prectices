package com.Interface;

interface Motercyle{
	
	void start();
	void stop();
	
	default void services() {
		System.out.println("Motercycle is under servicing");
	}
	
	static void servicesCenterInfo() {
		System.out.println("Services Center : XYZ is servicing byke ");
		
	}
	
}
 
class Cara implements Motercyle{

	@Override
	public void start() {
 System.out.println("Car is start");		
	}

	@Override
	public void stop() {
		 System.out.println("Car is stop");
		
	}
	
}
 
class Bike  implements Motercyle{

	@Override
	public void start() {
 System.out.println("Bike is starting");		
	}

	@Override
	public void stop() {
 System.out.println("Bike is stoping");		
	}
	
}

public class ServiceCenterApp{
	public static void main(String[] args) {
		Motercyle.servicesCenterInfo();
		
		
		Cara car =  new Cara();
		car.start();
		car.services();
		car.stop();
		
		Bike bike = new Bike();
		bike.start();
		bike.services();
		bike.stop();
		
	}
	
}
 