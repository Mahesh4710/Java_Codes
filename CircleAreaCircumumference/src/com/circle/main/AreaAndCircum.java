package com.circle.main;

import java.util.Scanner;

public class AreaAndCircum {
	static final float PI=3.142f;
	float area;
	float circum;
	float areaOfCircle(float radius){
		area=PI*radius*radius;
		return area;		
	}
	float circumferenceOfCircle(float radius){
		circum=PI*2*radius;
		return circum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius=sc.nextFloat();
		AreaAndCircum obj=new AreaAndCircum();
		System.out.println("Area of circle is : "+obj.areaOfCircle(radius)) ;
		System.out.println("Circumference of circle is : "+obj.circumferenceOfCircle(radius)) ;
		
		
	}

}
