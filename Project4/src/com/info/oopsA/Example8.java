package com.info.oopsA;
class Employee{
	String name;
	String address;
	double salary;
	String jobTitle;
	public Employee() {
		super();
		
	}
	public Employee(String name, String address, double salary, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void calculatingBounus() {
		System.out.println("Bouns");
	}
	public void generatingPerf() {
		System.out.println("Generating performance report");
	}
	public void managingproject() {
		System.out.println(" ManagingProject");
	}
	
}

class Manager extends  Employee{

	public Manager() {
		super();
		
	}

	public Manager(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		
		System.out.printf("Name is manager"+name,"Address is"+address+"Slary" +salary+"JobTitle"+jobTitle);
		
		
	}
	public void calculatingBounus() {
		double b=getSalary()*0.3;
		System.out.println("Bounus "+b);
	}
	public void generatingPerf() {
		System.out.println(" PERFORMANCE IS"+getName()+"Good");
	}
	public void managingproject() {
		System.out.println(" ManagingProject is "+getName()+"Manage Project");
	}
	
}
class Developer extends  Employee{
	

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		System.out.printf("Name is Developer"+name,"Address is"+address+"Slary" +salary+"JobTitle"+jobTitle);
	}
	public void calculatingBounus() {
		double b=getSalary()*0.2;
		System.out.println("Bounus "+b);
	}
	public void generatingPerf() {
		System.out.println(" PERFORMANCE IS"+getName()+"Good");
	}
	public void managingproject() {
		System.out.println(" ManagingProject is "+getName()+"Manage Project Well");
	}
	
	
}
class Programmer extends Employee{

	public Programmer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		
	}
	public void calculatingBounus() {
		double b=getSalary()*0.2;
		System.out.println("Bounus "+b);
	}
	public void generatingPerf() {
		System.out.println(" PERFORMANCE IS"+getName()+"Good");
	}
	public void managingproject() {
		System.out.println(" ManagingProject is "+getName()+"Manage Project Well");
	}
	
	
}


public class Example8 {

	public static void main(String[] args) {
		//Employee e= new Employee();
		//e.calculatingBonuses();
		//e.generatingPerf();
		//e.managingproject();
		
		
	System.out.println("***************Manager**************")	;
	Manager m=new Manager("Pooja", "Jalna",25000.00, "Manager");
	m.calculatingBounus();
	m.generatingPerf();
	m.managingproject();
	
	System.out.println("*********** Developer********************** ");
	 Developer d= new  Developer("Arati", "Pune",20000.00, "Developer");
	 d.calculatingBounus();
	 d.generatingPerf();
	 d.managingproject();
	 
	 
	 System.out.println("************Programmer*************** ");
	 Programmer p= new Programmer ("Arati", "Pune",15000.00, "Programmer ");
	 p.calculatingBounus();
	 p.generatingPerf();
	 p.managingproject();
	 
	
	}

}



