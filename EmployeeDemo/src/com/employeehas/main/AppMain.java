package com.employeehas.main;

public class AppMain {
	

	public static void main(String[] args) {
		EmployeepPojo emp=new EmployeepPojo("Mahesh",5000);
		System.out.println("Raised salary of employee is"+ emp.raiseSalary());
	}

}
