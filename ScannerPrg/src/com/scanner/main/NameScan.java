package com.scanner.main;

import java.util.Scanner;

public class NameScan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello!, How are you ?");
		System.out.print("Enter your First name :");
		String fName=sc.nextLine();
		System.out.print("Enter your Last name : ");
		String lName=sc.nextLine();
		System.out.println("Your name is "+fName+" " +lName);

	}

}
