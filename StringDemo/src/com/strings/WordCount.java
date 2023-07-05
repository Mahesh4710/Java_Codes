package com.strings;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the strig : ");
		String str=sc.nextLine();
		
		int wordCount=0,notEmpty=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && i>0) {
				notEmpty=1;
				wordCount=wordCount+1;
			}
		}
		System.out.println(wordCount+notEmpty);
	}

}
