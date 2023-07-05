package com.arraysinjava.main;

public class LargestElement {
	public static void main(String[] args) {
		int greater=0;
		int[] arr=new int[] {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			if(greater<arr[i]) {
				greater=arr[i];
			}
			else {
				greater=0;
			}
		}
		System.out.println("Greater element is"+greater);
	}
}
