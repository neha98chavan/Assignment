package com.info.threadingAssignment;
class Company{
	int n;
	boolean f= false;
	 synchronized void produceItem(int n) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Produes:"+this.n);
		f=true;
		notify();
	}
	 
	synchronized void consumeItem() {
			if(f) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			System.out.println("Consume:"+this.n);
			f=true;
			notify();
		}


}
class Producer extends Thread{
	Company c;
	public Producer(Company c) {
		this.c=c;
		
	}
	public void run() {
		int i=1;
		while(true) {
			c.produceItem(i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
	
}
class Consumer extends Thread{
	Company c;
	public Consumer(Company c) {
		this.c=c;
	}
	public void run() {
	int i=1;
	while(true) {
		c.consumeItem();
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
}

}

public class CustomerProducer {

	public static void main(String[] args) {
		Company c= new Company();
		 Producer p = new  Producer(c);
		 Consumer c1= new Consumer(c);
		 p.start();
		 c1.start();
		 

	}

}
