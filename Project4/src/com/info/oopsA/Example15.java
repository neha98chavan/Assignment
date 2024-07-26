package com.info.oopsA;
interface Fruit{
	void hasAPeel();
}
interface vegitable{
	void hasARoot();
}
class Tomato implements Fruit, vegitable{
	public void hasAPeel() {
		System.out.println("Tomato has a peel");
	}
	public void hasARoot() {
		System.out.println("Tomato has a Root");
	}
}

public class Example15 {

	public static void main(String[] args) {
		Tomato t= new Tomato();
		t.hasAPeel();
		t.hasARoot();

	}

}
