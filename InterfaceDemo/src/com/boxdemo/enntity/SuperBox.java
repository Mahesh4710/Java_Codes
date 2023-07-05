package com.boxdemo.enntity;

public class SuperBox {
	double width ,height ,depth;
	
	public SuperBox(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double volume(){
		return height*width*depth;
	}
}
