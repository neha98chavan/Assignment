package com.info.oopsA;

import java.util.Scanner;

class Addition{
	
	int num1;
	int num2;
	void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 st number :");
		int num1=sc.nextInt();
		System.out.println("Enter the 2 nd number: ");
		int num2=sc.nextInt();
		int a=num1+num2;
		System.out.println("Addition of the number :"+a);
		}

	void add(int num1, int num2) {
		double a= num1+num2;
		System.out.println("Addition is :"+a);
		
		}

	
	
}
public class Exmaple5 {
		

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add();
		a.add(5, 5);
		
	}

}



/***********Output************
Enter the 1 st number :
4
Enter the 2 nd number: 
4
Addition of the number :8
Addition is :10.0
**********************/