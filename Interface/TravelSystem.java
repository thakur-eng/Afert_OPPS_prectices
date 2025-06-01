package com.Interface;

interface Travel{
	void go();
	
}

class BusTravel implements Travel{

	@Override
	public void go() {
 System.out.println("This is traving through Bus");		
	}
	
}

class TrainTravel implements Travel{

	@Override
	public void go() {
 System.out.println("This is travling through train");		
	}
	
}

class FlightTravel implements Travel{

	@Override
	public void go() {
 System.out.println(" This is travling through Flight ");		
	}
	
}


public class TravelSystem {

	public static void main(String[] args) {
				
		Travel mode;
		
		String type = "Flight";
		
		 if (type.equals("Bus")) {
	            mode = new BusTravel();
	        } else if (type.equals("Train")) {
	            mode = new TrainTravel();
	        } else {
	            mode = new FlightTravel();
	        }

		  
		  mode.go();
	}

}
