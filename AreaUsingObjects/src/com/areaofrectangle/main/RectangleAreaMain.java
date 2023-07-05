package com.areaofrectangle.main;

import java.util.Scanner;

public class RectangleAreaMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rectangles area you want to calculate : ");
		int nRectangles=sc.nextInt();
		
		RectangleArea[] numberRecs=new RectangleArea[nRectangles];
		
		for(int i=0;i<nRectangles;i++) {
			System.out.println("Enter length of rectangle "+(i+1));
			float length=sc.nextFloat();
		
			System.out.println("Enter width of rectangle "+(i+1));
			float width=sc.nextFloat();
			 numberRecs[i]=new RectangleArea(length,width);
		}
		
		for(int i=0;i<numberRecs.length;i++) {
			System.out.println("Length of rectangle "+numberRecs[i].getLength()+
					" Width of rectangle "+numberRecs[i].getWidth());
			System.out.println("Area of rectangle is "+ numberRecs[i].getLength() * numberRecs[i].getWidth());
		}
		

	}

}
