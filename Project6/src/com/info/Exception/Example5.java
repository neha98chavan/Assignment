package com.info.Exception;

import java.util.Scanner;
class Duplicateelmentsfind extends Exception{
	public String getMessage() {
		return "Duplicate values are present";
	}
}
class demo1{
	void Takeelements() {
		int []arr=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter elements");
			int value=sc.nextInt();
			arr[i]=value;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		try {
			uniqueelements(arr);
			
		}catch(Duplicateelmentsfind de) {
			System.out.println(de.getMessage());
		}
	}
	static void uniqueelements(int arr[]) throws Duplicateelmentsfind{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					Duplicateelmentsfind de=new Duplicateelmentsfind();
					throw de;
				}
			}
		}
	}
	
	
}

public class Example5 {
	

	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.Takeelements();
	}

}
