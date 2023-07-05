package com.marryme.main;

import java.util.Scanner;

public class MarriageAgeChecker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your gender \n1.M for male \n2.F for female");
		s.next();
		System.out.println("Enter your age :");
		int age=s.nextInt();
		if(age>=21)
			System.out.println("You are elible for marriage.");
		else
			System.out.println("You are not elible for marriage.");
	}

}
