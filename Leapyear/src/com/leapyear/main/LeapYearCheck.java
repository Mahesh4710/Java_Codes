package com.leapyear.main;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter year to check it is leap : ");
		int year=sc.nextInt();
		
		if(year%400==0)
			System.out.println(year+" leap year");
		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println(year+" leap year");
		else
			System.out.println(year+" Not a leap year");
		
	}

}
