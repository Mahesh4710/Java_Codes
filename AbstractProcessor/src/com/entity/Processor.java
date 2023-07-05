package com.entity;

public abstract class Processor {
	int data;

	public Processor(int data) {
		super();
		this.data = data;
	}
	public void showData(){
		System.out.println("value is "+data);
	}
	abstract void process();
}
