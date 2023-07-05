package com.gb.main;

import com.gbgdemo.pojo.Employee;

public class AppMain {
	public static void main(String[] args) {
		Employee e1=new Employee(1233);
		Employee e2=e1;
		
		Employee e3=new Employee(1234);
		
		e3=null;
		e1=null;
		e2=null;
		
		Employee e4=new Employee(1235);
		System.gc();
		
	}
}
