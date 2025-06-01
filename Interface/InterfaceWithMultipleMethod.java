package com.Interface;

interface Byke
{
	void honda();
	void hero();
	void bullet();
	
}


public class InterfaceWithMultipleMethod  implements Byke{

	

	@Override
	public void honda() {
System.out.println("Honda is good byke for malage ");
	}

	@Override
	public void hero() {
		System.out.println("Hero is good byke for Price ");
		
	}

	@Override
	public void bullet() {
		System.out.println("Bullet is good byke for Longtrip ");
		
	}
	
	public static void main(String[] args) {

		System.out.println("Start");
		
		Byke Obj = new InterfaceWithMultipleMethod();
		Obj.bullet();
		Obj.honda();
		Obj.honda();
		
		System.out.println("Exit ");
	}

}
