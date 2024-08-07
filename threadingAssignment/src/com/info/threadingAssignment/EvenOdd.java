package com.info.threadingAssignment;

class Demo1{
	int n;
	boolean f= false;
	 synchronized void printEven(int n) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Even number:"+this.n);
		f=true;
		notify();
	}
	 synchronized void printOdd(int n) {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Odd number:"+this.n);
		f=false;
		notify();
	}
	
	
}
class EvenThread extends Thread{
	Demo1 t;
	public EvenThread(Demo1 t) {
		this.t=t;
	}
	public void run() {
		for(int i=0;i<=8;i+=2) {
			t.printEven(i);
		}
	}
	
	
}
class OddThread extends Thread{
	Demo1 t;
	public OddThread(Demo1 t) {
		this.t=t;
		
	}
	public void run() {
		for(int i=1;i<=8;i+=2) {
			t.printOdd(i);
			
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		Demo1 d1= new Demo1();
		EvenThread et= new EvenThread(d1);
		OddThread ot= new OddThread(d1);
		et.start();
		ot.start();

	}

}
