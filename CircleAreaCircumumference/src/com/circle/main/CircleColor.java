package com.circle.main;

public class CircleColor {
	float radius;
	String color;
	
	CircleColor(){
		radius=1.0f;
		color="RED";
	}
	public void printColor(){
		System.out.println("Radius is "+radius);
		System.out.println("Color is "+color);

	}

	public static void main(String[] args) {
		
		CircleColor obj=new CircleColor();
		obj.printColor();
	}

}
