package com.info.oopsA;
abstract class Bird2 {
	abstract void fly();
	abstract void makeSound();
	
}
class Eagle extends Bird2{
	void fly() {
		System.out.println("Eagle fly High");
	}
	void makeSound() {
		System.out.println("Eagle sound is soft  ");
	}
}
class Hawk extends Bird2{
	void fly() {
		System.out.println("Hawke Fly is high But no More than eagle");
	}
	void makeSound() {
		System.out.println("Hawke Sound is high");
	}
}
public class Example11 {

	public static void main(String[] args) {
		Eagle e= new Eagle();
		e.fly();
		e.makeSound();
		
		Hawk h=new Hawk();
		h.fly();
		h.makeSound();
		
	}

}
