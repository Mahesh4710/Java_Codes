package com.buffer.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferPrg {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter First number");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter Second number");
		int num2=Integer.parseInt(br.readLine());
		int sum=num1+num2;
		int diff=num1-num2;
		int mul=num1/num2;
		int div=num1*num2;
		
		System.out.println("Sum of "+num1+" and "+num2+"is : "+sum);
		System.out.println("Difference of "+num1+" and "+num2+"is: "+diff);
		System.out.println("Multiplication of "+num1+" and "+num2+"is: "+mul);
		System.out.println("Division of "+num1+" and "+num2+"is: "+div);
	}

}
