package com.overridig.entity;

public class SupeClass {
	int a,b;
	
	public SupeClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void show(){
		System.out.println("From super a is"+a);
		System.out.println("From super b is"+b);

	}
}
