package com.arrayprgs.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestElementArray {
	int arr[],size;
	
	int largestElement() throws IOException{
		BufferedReader r=new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Enter the size of array :");
		size=Integer.parseInt(r.readLine());
		System.out.println("Enter elements in array :");
		for(int i=0;i<size;i++) {
			arr[i]=Integer.parseInt(r.readLine());
		}
		return 0;
	}

	public static void main(String[] args)throws IOException {
		
		LargestElementArray l=new LargestElementArray();
		l.largestElement();
		
	}

}
