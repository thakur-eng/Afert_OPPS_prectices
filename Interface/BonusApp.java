package com.Interface;

interface  BonusCalculate{
	double calculateBonus( double salary);
}

public class BonusApp {

	public static void main(String[] args) {
 
		BonusCalculate bonus = (salary) -> salary*0.10;
		
		System.out.println(bonus.calculateBonus(55000));
	}

}
