package com.info.Exception;

import java.util.Scanner;
class vowelException extends Exception{
	public String getMessage() {
		return"String contain vowels";
	}
}
class demo2{
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		try {
			demo2.VowelNumber( str1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void VowelNumber(String str1) throws Exception{
		String vowels="AEIOUaeiou";
		for(int i=0;i<str1.length();i++){
			char c=str1.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='o'||c=='u') {
				 vowelException e=new  vowelException();
				throw e;
			}
			
		}
			System.out.println("String does not contain vowes");
		
		
	}
	
}

public class Example6 {

	public static void main(String[] args) {
		 demo2 de=new  demo2();
		 de.input();
	}

}



/**************Output************
Enter the String
java is awsome
String contain vowels



***********************/
