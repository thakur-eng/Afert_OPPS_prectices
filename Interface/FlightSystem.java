package com.Interface;

interface IAirline
{
	public abstract void ticatAirline();
	
	public abstract void invoiceAirline();
	
	public abstract void paymentAirline();
	
	public abstract void fastfoodAirline();
	
	public abstract void meelAirline();
	
	public abstract void discountAirline();
	
	public abstract void windowsheetAirline();
	
	public   static  void drink ()
	{
		System.out.println("IAirline.drink is only for international ");
	}
	
}



public class FlightSystem {

	public static void main(String[] args) {
		FlightSystem ticket = new FlightSystem();
        ticket.ticatAirline();
}

	private void ticatAirline() {
		// TODO Auto-generated method stub
		
	}
}