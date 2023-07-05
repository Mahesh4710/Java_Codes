package com.linkedin.eg;

public class LinearStringSearch {
	public static void main(String[] args) {
		String name="Mahesh";
		char target='h';
		
		int a=stringsearch(name,target);
		System.out.println(a);
	}
	
	static int stringsearch(String name,char target){
		if(name.length()==0)
			return -1;
		
		for(int i=0;i<name.length();i++) {
			char s=name.charAt(i);
			if(s==target) {
				return i;
			}
		}
		return -1;
	}
}
