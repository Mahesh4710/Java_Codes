package com.buffer.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameScanPrg {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in) );
		
		System.out.println("This program is for Read name from user and print on the screen");
		System.out.println("Enter your First name : ");
		String fName=br.readLine(); 
		System.out.println("Enter your last name");
		String lName=br.readLine();
		
		System.out.println("Your name is "+fName+" "+lName);
	}

}
