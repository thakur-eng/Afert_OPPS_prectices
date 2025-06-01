package com.opps.encapsulation;


class Car{
	private int speed;
	
	public void setSpeed(int speed) {
		
		if(speed >= 0 && speed <=180)
		{
			this.speed= speed;
		}
		else {
			System.out.println("Invalid speed. must be between 0 and 180 km/h");
			
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		if(speed +10 <= 180 ) {
			speed += 10;
			System.out.println("Accelerate to " +speed + "km/h");
		}
		else {
			System.out.println("Max speed limit reached.");
			
		}}
		
 	    public void brake() {

		{
			if(speed -10>=0)
			{
				speed -=10;
				System.out.println("Slowed down to " + speed + "km/h");
			}
			else {
				System.out.println("car is already at rest.");
			}
		}
	}
	

}




public class CarSpeedControlSystem {

	public static void main(String[] args) {
 
		Car mycar = new Car();
		mycar.setSpeed(59);
		mycar.accelerate();
		mycar.accelerate();
		mycar.setSpeed(200);
		mycar.brake();
		System.out.println("Final Speed :" + mycar.getSpeed());
		
	}

}
