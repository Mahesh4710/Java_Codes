package com.employee.main;

import java.util.Scanner;

public class GrossSalaryByFun {
	int empCode;
	
	int basicPay;
	float DA;
	float HRA;
	float grossPay;
	String empName;
	
	void setValues() {
	Scanner emp=new Scanner(System.in);
		
	System.out.print("Ennter your employee code :");
	empCode=emp.nextInt();
	System.out.println("Enter your employee name :");
	empName=emp.nextLine();
	empName=emp.nextLine();
	System.out.print("Enter your employee basicPay :");
	basicPay=emp.nextInt();
	
	}
	float calGrossSalary() {
		if(basicPay<3500) {
			grossPay=basicPay+(basicPay*45/100)+(basicPay*20/100);
		}
		else
			grossPay=basicPay+(basicPay*50/100)+1000;
		
		return grossPay;
	}
	void printGrossSalary(){
		System.out.println("Gross Salary of employee code "+empCode+" whose name "+empName+" Having basic pay of "+basicPay+" is "+grossPay);
	}

	public static void main(String[] args) {
		GrossSalaryByFun empsal=new GrossSalaryByFun();
		empsal.setValues();
		
		empsal.calGrossSalary();
		
		empsal.printGrossSalary();
	}

}
