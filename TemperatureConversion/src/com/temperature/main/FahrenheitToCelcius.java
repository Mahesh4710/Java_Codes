package com.temperature.main;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrenheit :" );
		Scanner sc=new Scanner(System.in);
		float tempFahrenheit=sc.nextFloat();
		float C= 5*(tempFahrenheit-32)/9;
		System.out.println("Fahrenheit "+tempFahrenheit+" to celcius "+C);
	}

}
