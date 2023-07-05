package com.buffer.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNums {

	public static void main(String[] args)throws IOException {
		BufferedReader bbr =new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter first number :");
		int fNum=Integer.parseInt(bbr.readLine());	
		System.out.println("Enter second number :");
		int sNum=Integer.parseInt(bbr.readLine());
		int sum=fNum+sNum;
		System.out.println(fNum+" + "+sNum+" is "+sum);
	}

}
