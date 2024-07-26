package com.info.Exception;

public class Example3 {

	public static void main(String[] args) {
		String str[]= new String[3];
		try {
		str[0]= "Neha";
		str[1]="pooja";
		str[2]="Manisha";
		str[3]="Pranita"; //ArrayIndexOutOfBoundsException
		System.out.println("length of array"+str.length);
		System.out.println("=========================================");
		
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception caught");
			
		}

	}

}
