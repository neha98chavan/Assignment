package com.info.Exception;

public class Example2 {

	public static void main(String[] args) {
		int   arr[]= {1,2,3,4,5,};
		try {
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]+"");
			
		}
	}
		catch(Exception e){
			System.out.println("Exception caught");
		}
		
	}
}


