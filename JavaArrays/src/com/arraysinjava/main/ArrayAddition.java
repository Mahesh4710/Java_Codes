package com.arraysinjava.main;

public class ArrayAddition {

	public static void main(String[] args) {
		int sum=0;
		int[] arr=new int[]{10,20,30,40,50};
		int[] arr1=new int[] {10,20,30,40,50};
		int[] arr3=new int[arr.length];
		
		if(arr.length==arr1.length) {
			for(int i=0,j=0,k=0;i<arr.length;i++,j++,k++) {
				arr3[k]=arr[i]+arr1[j];
			}
			
		}
		else {
			System.out.println("Check size of array this is not same :");
			
			
			}
		for(int item:arr3) {
			System.out.println(item);
		}
	}

}
