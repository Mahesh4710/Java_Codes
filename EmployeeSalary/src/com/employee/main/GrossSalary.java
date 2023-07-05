package com.employee.main;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the payment to be paid for employee :");
		int payment=sc.nextInt();
		if(payment<10000) {
			float da=(payment*98)/100;
			float hra=(payment*10)/100;
			
			float gSalary=payment+da+hra;
			System.out.println("Your gross salary is "+gSalary);
		}
		else {
			float da=(payment*98)/100;
			float gSalary=payment+da+2000;
			System.out.println("Your gross salary is "+gSalary);
		}
	}
}
