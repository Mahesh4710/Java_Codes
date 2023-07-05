package com.boxdemo.enntity;

public class AppMainBox {

	public static void main(String[] args) {
		SuperBox ref=new SubClassBoxWeight(2,3,4);
		System.out.println("Volume is "+ref.volume());
	}

}
