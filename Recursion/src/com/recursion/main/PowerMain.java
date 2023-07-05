package com.recursion.main;

import java.util.Scanner;

import com.recursion.eg.PowerCalculation;

public class PowerMain {

	public static void main(String[] args) {
		PowerCalculation pw=new PowerCalculation();
		
		System.out.print("Enter base value : ");
		Scanner sc =new Scanner(System.in);
		int base=sc.nextInt();
		
		System.out.print("Enter power to calculate :");
		int pwr=sc.nextInt();

		System.out.println(base +"^"+pwr +"="+pw.pow(base, pwr));
	}

}
