package com.strings;

import java.util.Scanner;

public class CapitalizeFirstWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		str=" "+str;
		String f="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				f=f+ch;
				i++;
				ch=str.charAt(i);
				f=f+Character.toUpperCase(ch);
				
			}
			else
				f=f+ch;
		}
		f=f.trim();
		System.out.println(f);
		
	}

}
