package com.info.oopsA;

class Animal{
	void sound() {
		System.out.println("The animal makes a sounds:  ");
	}
}
class Bird extends Animal{

	@Override
	void sound() {
		
		System.out.println("The bird is chirps");
	}
	
}
class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("The cat is meows");
		
	}
	
}
public class Exmaple3 {

	public static void main(String[] args) {
		
		Animal a= new Animal();
		Bird b= new Bird();
		Cat c= new Cat();
		a.sound();
		b.sound();
		c.sound();
	}

}




/*********Output**************
The animal makes a sounds:  
The bird is chirps
The cat is meows
**************************/