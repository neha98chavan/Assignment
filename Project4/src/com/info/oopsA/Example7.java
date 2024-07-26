package com.info.oopsA;

class Vehicle1{
	void drive() {
		
		System.out.println(" Car Drive Start");
	}
	
}
	

class Car1 extends Vehicle1{
	
	void drive() {
		System.out.println("Repairing a car");
	}
	
	
}


public class Example7 {

	public static void main(String[] args) {
		
		Vehicle1 v= new Vehicle1();
		Car1 c= new Car1();
		v.drive();
		c.drive();
	}

}



/******OutPut***********
Car Drive Start
Repairing a car

***************/