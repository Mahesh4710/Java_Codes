package com.collection.mainn;

import com.collections.Employee;
import java.util.ArrayList;
import java.util.Scanner;


public class CollectionExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> numEmployees=new ArrayList<>();
		numEmployees.add(new Employee("Mahesh","43",50000));
		numEmployees.add(new Employee("Mahesh1","43",50000));
		numEmployees.add(new Employee("Mahesh2","43",50000));
		numEmployees.add(new Employee("Mahesh3","43",50000));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of employee to search : ");
		String code=sc.next();
		
		 

	}

}
