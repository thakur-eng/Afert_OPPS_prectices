package com.Interface;



interface Cricate {
	void match();
}

public class FunctionalInterfaceWithoutLamda {

	public static void main(String[] args) {
		
        //  Using anonymous inner class

		Cricate batsman = new Cricate()

		{
		@Override 
		public void match()
		{
			System.out.println("Without Lamda ");
		}
		};
		batsman.match();
	}

}
