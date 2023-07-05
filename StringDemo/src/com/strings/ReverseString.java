package com.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String reversedString="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String you want :");
		String urString=sc.nextLine();
		
		char ch[]=urString.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reversedString=reversedString+ch[i];
		}
		System.out.println("Original St`ring is : "+urString);

		System.out.println("Reversed String is : "+reversedString);
	}

}
