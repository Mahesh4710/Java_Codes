package com.simpleinterest.main;

import java.util.Scanner;

public class SimpleInterestPrg {

	public static void main(String[] args) {
		System.out.println("Lets Find Simple Interest.");
		System.out.println();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		float pAmount=c.nextFloat();
		System.out.println("Enter the rate of interest :");
		float iRate=c.nextFloat();
		System.out.println("Enter time in years");
		float time=c.nextFloat();
		float simpleInterest=pAmount*iRate*time/100;
		
		System.out.println("Simple Interest of given amount "+pAmount+" For time "+time+" is :"+simpleInterest);
		
	}

}
