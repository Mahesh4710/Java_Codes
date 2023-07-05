package com.collections;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.contains(10));;
		
		list.add(3, 10);
		
		System.out.println(list);
		
		System.out.println(list.hashCode());
		
		System.out.println(list.indexOf(50));
		
		System.out.println(list.remove(0));
		
		System.out.println(list);
		}

}
