package com.info.Exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String st) {
		super(st);
	}
	
}
public class Example1 {
	static void validate (int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}else {
			System.out.println("Welcome to vote");
		}
		
	}
	

	public static void main(String[] args) {
		try {
			validate(20);
		}catch(InvalidAgeException ex) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured :"+ex);
		}
		System.out.println("Rest of the code");
	}

}
