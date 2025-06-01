package com.Interface;

interface Calculators{
	void add(int a , int b);
}
public class Lambda_with_Parameterr {

	public static void main(String[] args) {
		
		Calculators calcu = (a,b) -> {
			System.out.println("Addition :" + (a+b));
		};
		
		calcu.add(13, 12); //a aur b parameters hain.

           //add method ka implementation lambda se hua.
 
	}

}
