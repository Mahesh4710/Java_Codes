package com.patterns.main;

import java.util.Scanner;

public class FirstPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines you want :");
		int line=sc.nextInt();
		for(int i=1;i<=line;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
