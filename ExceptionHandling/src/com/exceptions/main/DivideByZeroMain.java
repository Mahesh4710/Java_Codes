package com.exceptions.main;



public class DivideByZeroMain {

	public static void main(String[] args) {
		int num1=1,num2=0,result=0;
		
		try {
			result=num1/num2;
		}
		catch (ArithmeticException e) {
			System.out.println("Canot divide by zero");
		}
	 

	}

}
