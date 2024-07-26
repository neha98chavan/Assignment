package com.info.oopsA;
abstract class Animal1
{
	public abstract void sound();
	
}
class Lion extends Animal1{
	public  void sound(){
		System.out.println("Lion Roars !");
	}
}
class Tiger extends Animal1{
	public void sound() {
	System.out.println("Tiger Growla !");
	}
}


public class Exmaple9 {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.sound();
		Tiger t= new Tiger();
		t.sound();
		
	}

}
