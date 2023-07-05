package com.greatersmaller.main;

import java.util.Scanner;

public class GreaterInThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("First using If else :");
		
		if(num1>num2 && num1>num3) 
			System.out.println("Num1 "+num1+" is bigger.");
		else if(num2>num1 && num2>num3)
			System.out.println("Num2 "+num2+" is bigger.");
		else
			System.out.println("Num3 "+num3+" is bigger.");
		
		System.out.println("Then using ternary operator :");
		 int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		 System.out.println("Greatest is :"+max);
	}

}
