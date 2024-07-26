package com.info.oopsA;

class Vehicle{
	int speed;
	void speedUp() {
		System.out.println("Vehicle is speeding Up-----");
	}
	
}


class Car extends Vehicle{
	@Override
	void speedUp() {
		speed =20;
		System.out.println("Car is Speedings up Current speeds:"+speed);
	}
	
}
class Bicycle extends Vehicle{

	@Override
	void speedUp() {
		speed=10;
		System.out.println("Bicycle is speeding up current speed :"+speed);
	}
	
}

public class Exmaple4 {

	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		Car c= new Car();
		Bicycle b = new Bicycle();
		v.speedUp();
		c.speedUp();
		b.speedUp();
	}

}



/******Output************
Vehicle is speeding Up-----
Car is Speedings up Current speeds:20
Bicycle is speeding up current speed :10
***************/