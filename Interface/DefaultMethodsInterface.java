package com.Interface;

interface Car{
	void start();
	
	default void service()
	{
		System.out.println("Thsi car is under mentinace ");
	}
}


public class DefaultMethodsInterface implements Car {

	public static void main(String[] args) {
		DefaultMethodsInterface ser = new DefaultMethodsInterface ();
		ser.service();
		ser.start();
		
	}

	@Override
	public void start() {
 
		System.out.println("This is takeing some time for serviceing part is coming ");
	}

}
