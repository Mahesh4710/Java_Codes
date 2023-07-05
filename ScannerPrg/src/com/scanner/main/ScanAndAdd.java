package com.scanner.main;

import java.util.Scanner;

public class ScanAndAdd {

	public static void main(String[] args) {
		System.out.println("Hello, let add two numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number :");
		int num1=sc.nextInt();
		System.out.println("Enter the second number :");
		int num2=sc.nextInt();
		int num3=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+ "is "+ num3 );
	}

}
