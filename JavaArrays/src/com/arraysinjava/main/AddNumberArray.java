package com.arraysinjava.main;

public class AddNumberArray {

	public static void main(String[] args) {
		int add=0;
		int[] arr=new int [] {10,20,30,40,50};
		for(int item:arr) {
			add=add+item;
			}
		System.out.println("Addition of all array is : "+add);
	}

}
