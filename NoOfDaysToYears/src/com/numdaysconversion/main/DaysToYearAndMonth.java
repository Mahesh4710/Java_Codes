package com.numdaysconversion.main;

import java.util.Scanner;

public class DaysToYearAndMonth {

	public static void main(String[] args) {
		System.out.println("Enter number of days : ");
		Scanner sc=new Scanner(System.in);
		
		long enteredDays=sc.nextLong();
		
		int years=(Math.toIntExact(enteredDays))/365;
		
		int temp=Math.toIntExact(enteredDays)%365;
		
		int month=temp/31;
		
		int days=temp%31;
		
		System.out.println("Years: "+years+" Months: "+month+" days: "+days);
	}

}
