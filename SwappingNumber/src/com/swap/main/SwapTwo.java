package com.swap.main;

import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int fNum=sc.nextInt();
		
		System.out.println("Enter 2nd num: ");
		int sNum=sc.nextInt();
		System.out.println("Before swapping First number is "+fNum+" Second number is "+sNum);
		
		fNum =sNum+fNum;
		sNum =fNum-sNum;
		fNum=fNum-sNum;
		
		
		System.out.println("After swapping First number is "+fNum+" Second number is "+sNum);
	}

}
