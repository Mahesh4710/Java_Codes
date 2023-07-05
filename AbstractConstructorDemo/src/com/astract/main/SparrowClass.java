package com.astract.main;

public class SparrowClass extends AnimalClass {
	String name;

	public SparrowClass(String name) {
		super(name);
		this.name=name;
		System.out.println("Constructor of SparrowClass called.");
	}
	public void displayName() {
		System.out.println("Name of Sparrow is "+name);
	}
	
}
