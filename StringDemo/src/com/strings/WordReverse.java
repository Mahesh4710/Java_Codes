package com.strings;

import java.util.Scanner;

public class WordReverse{
	static String makeReverse(String str)
	{
		StringBuffer s = new StringBuffer(str);
		str = s.reverse().toString();
		String[] rev = str.split(" ");
		StringBuffer reverse = new StringBuffer();
		for (int i = rev.length - 1; i >= 0; i--) {
			reverse.append(rev[i]).append(" ");
		}
		return reverse.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		System.out.println(makeReverse(str));
	}
}
