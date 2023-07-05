package com.challenges;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] twoSum(int[]arr, int target) {
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j] ==target) {
					return new int[] {i,j};
				}
			}
			
		}
		return null;
	}
	
	
	
	
	public static void main(String[] args) {
		TwoSum ref=new TwoSum();
		int[] myArray= {1,2,3,4};
		
//		int[] result=ref.twoSum(myArray, 7);
//		
//		System.out.println(Arrays.toString(result));
		
		System.out.println(Arrays.toString(twoSum(myArray, 7)));

	}

}
