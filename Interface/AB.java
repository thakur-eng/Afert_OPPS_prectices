package com.Interface;
interface ABB
{
	void m2();
	
}
class ACC implements ABB
{

	@Override
	public void m2() {
		System.out.println("hello ji");
		
	}
	
}
public class AB {
public static void main(String[] args) {
	System.out.println("i am ");
	ACC acc =  new ACC();
	acc.m2();
}
}
