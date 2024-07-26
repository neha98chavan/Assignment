package com.info.oopsA;

interface Shape{
	void getArea();
}
class Rectangle implements Shape{
	public void getArea() {
		int l=2;
		int b=5;
		int a=l*b;
		System.out.println("Area of Rectangle is "+a);
	}
	
}
class Circle implements Shape{
	public void getArea() {
		int r=5;
		double a=3.14*r*r;
		System.out.println("Area of Circle is : "+a);
	}
}
class Triangle implements Shape{
	public void getArea() {
		int b=3;
		int h=8;
		int a=1/2*b*h;
		System.out.println("Area of Triangle :"+a);
	}
}


public class Exmaple2 {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.getArea();
		Circle c= new Circle();
		c.getArea();
		Triangle t =new Triangle();
		t.getArea();
		
	}

}


/***********Output********
 Area of Rectangle is 10
Area of Circle is : 78.5
Area of Triangle :0
************************/
