package com.overridig.entity;

public class SubClass extends SupeClass{
	int k;
	
	public SubClass(int a, int b, int k) {
		super(a, b);
		this.k = k;
	}
	@Override
	public void show(){
		System.out.println("From sub a is"+k);
		
	}
}
