package com.opps.abstractclass;

abstract class Shape{
	
	abstract double area();
	
}

class Circle extends Shape{

	double radius;
	
	Circle(double radius){
		
		this.radius = radius;
	}
	
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	
}




public class FindArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape a = new Circle(2);
		a.area();
		System.out.println(a.area());
		
	}

}
