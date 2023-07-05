package com.patterns.main;

import java.util.Scanner;

public class SecondPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines you want :");
		int line=sc.nextInt();
		for(int i=0;i<=line;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
