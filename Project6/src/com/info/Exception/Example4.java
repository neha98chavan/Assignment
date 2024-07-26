package com.info.Exception;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside try Block");
			int a=5;
			int b=0;
			double d=a/b;
			System.out.println("Division "+d);
		}
		catch(ArithmeticException ae) {
			System.out.println("catch :Exception handle.");
		}
		finally {
			System.out.println("Finally : i Excuted always");
		}
	}

}
