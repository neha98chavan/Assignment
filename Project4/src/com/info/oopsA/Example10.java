package com.info.oopsA;

abstract class Person{
	abstract void eat();
	abstract void exercise();
}
class Athlete extends Person{
	 void eat() {
		System.out.println("Athlete Person is Planned & Healthy diet");
	}
	void exercise() {
		System.out.println("Athlete Person is Planned & daily Exercies");
	}
}
class LazyPerson extends Person{
	void eat() {
		System.out.println("LazyPerson Person is No Planned & No  Healthy diet");
	}
	void exercise() {
		System.out.println("LazyPerson Person is  daily Exercies");
	}
}
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete a= new Athlete ();
		a.eat();
		a.exercise();
		
		LazyPerson l= new LazyPerson();
		l.eat();
		l.exercise();
		
	}

}
