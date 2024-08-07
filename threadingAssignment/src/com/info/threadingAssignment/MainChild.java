package com.info.threadingAssignment;
class Demo extends Thread{
	
	public void run() {
		System.out.println("In Child Thread");
	}
}


public class MainChild {

	public static void main(String[] args) {
		Demo d= new Demo();
		d.start();
		System.out.println("In Main Thread");
	}

}
