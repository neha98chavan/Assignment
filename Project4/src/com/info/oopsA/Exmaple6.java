package com.info.oopsA;

class Shape1{
	
	void getPerimeter() {
		System.out.println(" Perimeter of Circle ");
		
	}
	void getArea() {
		
		System.out.println("area of circle ");
		
	}
	
}
class Circle1{

	void getPerimeter() {
		double r=5;
		double p=2*3.14*r;
		System.out.println("Perimeter is circle :"+p);
		
	}
	
	void getArea() {
		int r=4;
		double a=r*r;
		System.out.println("Area of Circle :"+a);
		
	}
	
	
	
}


public class Exmaple6 {

	public static void main(String[] args) {
		Shape1 s= new Shape1();
		Circle1 c= new Circle1();
		s.getPerimeter();
		s.getArea();
		
		c.getPerimeter();
		c.getArea();
		
		
	}
}


/************OutPut***********8
Perimeter of Circle 
area of circle 
Perimeter is circle :31.400000000000002
Area of Circle :16.0
***************************/