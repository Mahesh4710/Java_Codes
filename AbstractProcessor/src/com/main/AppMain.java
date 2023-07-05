package com.main;

import java.util.Scanner;

import com.entity.Circle;
import com.entity.Factorial;

public class AppMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select from below: \n 1.Factorial \n 2.Area of Circle \nEnter your choice");
		int choice=sc.nextInt();
		
		System.out.print("Enter the value you want :");
		int value=sc.nextInt();
		if(choice==1) {
			Factorial ref1=new Factorial(value);
			ref1.process();
		}
		else if(choice==2) {
			Circle ref2=new Circle(value);
			ref2.process();
		}
		else
			System.out.println("Enter valid choice !");
	}

}
