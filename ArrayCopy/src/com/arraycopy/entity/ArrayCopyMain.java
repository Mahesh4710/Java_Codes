package com.arraycopy.entity;

import java.util.Arrays;
import static java.lang.System.*;
import static com.stati.ABC.Show;;

public class ArrayCopyMain {
	public static void main(String[] args) {
		int[] a1= {10,20,30,40};
		//int[] a2=a1.clone();
		
		//int[] a2=new int[4];
		//System.arraycopy(a1,0,a2,0,2);
		
		//int[] a2=Arrays.copyOf(a1, 2);
		
		int[] a2=Arrays.copyOfRange(a1, 0, 2);
		 out.println("Elemennts are :");
		a1[0]=100;
		for(int x : a2) {
			out.println(x);
			
			
		}
		
	}
	
	//show();

}
