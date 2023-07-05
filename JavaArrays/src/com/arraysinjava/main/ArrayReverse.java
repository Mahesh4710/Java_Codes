package com.arraysinjava.main;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] myArray=new int[] {10,20,30,40,50,60,70,80};
		System.out.println("Reverse of first half is :");
		for(int i=(myArray.length/2)-1;i>=0;i--) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("Reverse of second half is :");
		for(int i=(myArray.length)-1;i>=(myArray.length/2);i--) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("Reverse array is :");
		for(int i=(myArray.length)-1;i>=0;i--) {
			System.out.println(myArray[i]);
		}

	}

}
