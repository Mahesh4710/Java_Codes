package com.marks.main;

import java.util.Scanner;

public class TotalMarksPercentage {
	int sumOfMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for sujects out of 100.");
		System.out.println("Enter the marks for suject 1");
		int s1=sc.nextInt();
		System.out.println("Enter the marks for suject 2");
		int s2=sc.nextInt();
		System.out.println("Enter the marks for suject 3");
		int s3=sc.nextInt();
		System.out.println("Enter the marks for suject 4");
		int s4=sc.nextInt();
		System.out.println("Enter the marks for suject 5");
		int s5=sc.nextInt();
		
		int sum=s1+s2+s3+s4+s5;
		return sum;
	}
	float totalPercent(float obtainedMarks) {
		return (obtainedMarks/500)*100;
	}
	

	public static void main(String[] args) {
		TotalMarksPercentage obj=new TotalMarksPercentage();
		int tMarks=obj.sumOfMarks();
		System.out.println("Total marks obtained is : "+tMarks);
		
		System.out.println("Total percentage obtained is : "+obj.totalPercent(tMarks)+"%");
	}

}
