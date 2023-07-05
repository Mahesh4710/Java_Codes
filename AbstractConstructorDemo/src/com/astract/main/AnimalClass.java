package com.astract.main;

public abstract class AnimalClass {
	String name; 
	public  AnimalClass(String name) {
		this.name=name;
		System.out.println("Constructor of abstract Animalclass is called.");
		System.out.println("Name is also initialized here look ->"+name);
	}
	public abstract void displayName();
}
