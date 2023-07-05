package com.entity;

public class Circle extends Processor {
	float areaCircle;
	public Circle(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		areaCircle=(float) (3.142*data);
		
	}

}
