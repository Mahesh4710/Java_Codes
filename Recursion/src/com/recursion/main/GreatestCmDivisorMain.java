package com.recursion.main;

import java.util.Scanner;

import com.recursion.eg.GreatestCmDivisor;

public class GreatestCmDivisorMain {

	public static void main(String[] args) {
		System.out.println("Enter num1 & num2 :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		GreatestCmDivisor gc=new GreatestCmDivisor();
        int result = gc.greatestCommonDv(n1,n2);
        System.out.println("The Greatest Common Divisor of " + n1 + " and " + n2 + " is " + result);
    }

}
