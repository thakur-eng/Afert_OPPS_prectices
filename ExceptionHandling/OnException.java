package com.ExceptionHandling;

class Emp extends Exception {
	public Emp(String name) {
		super(name);
	}
}

public class OnException {

	public static void main(String[] args) {
		//System.out.println("Start");
		try {
			String name = "Ashish";

			if (name.equals("Ashish")) {
			//	System.out.println("Its work ");
				throw new Emp(" user all ready ");
			}	
		} 
		
		catch (Emp e) {

			System.out.println("Its catch block exits ");
		}
		
		//System.out.println("Exit");
	}

}
