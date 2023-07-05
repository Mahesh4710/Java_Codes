package com.interfacedemo.entity;


public class Employee implements Taxable {
	String empId,name;
	double salary;

	public Employee(String empId, String name, double salary){
		 this.empId = empId;
	     this.name = name;
	     this.salary = salary;
	}
	@Override
	public void calcTax() {
		
		
		double incomeTaxAmount= (salary* incomeTax);
		System.out.println("Employee: " + name + " has to pay Income Tax of " + incomeTaxAmount);//		Scanner calci= new Scanner(System.in);
		
	}
}

