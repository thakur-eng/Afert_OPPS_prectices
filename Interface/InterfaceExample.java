package com.Interface;

interface BusStop
{
	void start();
	void stop();
	
}



public class InterfaceExample  implements BusStop
{

	public static void main(String[] args) {
		
		InterfaceExample bus = new InterfaceExample();
		bus.start();
		bus.stop();
		
 
		
	}

	@Override
	public void start() {
 System.out.println("Start in BTM");		
	}

	@Override
	public void stop() {
		 System.out.println("Stop in Koremangla");		
		
	}

}
