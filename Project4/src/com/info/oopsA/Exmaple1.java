package com.info.oopsA;
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Exmaple1 {

	public static void main(String[] args) {
		Student s= new Student("Neha",22);
		System.out.println("Name is :"+s.name);
		System.out.println("Age is "+s.age);
		
		
	}

}
/**********Output
Name is :Neha
Age is 22
*************/