package com.entity;

public class Factorial extends Processor{
	int Factorial=1;
	

	public Factorial(int data, int factNNum) {
		super(data);
		
	}

	public Factorial(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		
		for(int i=2;i<=data;i++) {
			Factorial=Factorial*i;
		}
		System.out.println("Factorial is : "+Factorial);
		
	}

}
