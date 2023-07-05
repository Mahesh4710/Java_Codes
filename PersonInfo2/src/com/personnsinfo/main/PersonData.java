package com.personnsinfo.main;

import java.util.Scanner;

public class PersonData {
	String name, address;
	int age;

	void setFullName() {
		Scanner data=new Scanner(System.in);
		System.out.println("Enter persons full name :");
		name=data.nextLine();
		
	}
	
	String getFullName() {
		
		return name;
	}
	
	void setAddress() {
		Scanner data=new Scanner(System.in);
		System.out.println("Enter persons Address :");
		address=data.nextLine();
		
	}
	String getAddress() {
		
		return address;
	}
	
	
	void setAge() {
		Scanner data=new Scanner(System.in);
		System.out.println("Enter persons Age :");
		age=data.nextInt();
	}
	
	int getAge() {
		return age;
	}
	
	boolean isAdult(int age) {
		if(age>18)
			return true;
		else
			return false;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How manny persons data you want :");
		int pNum=sc.nextInt();
		sc.nextLine();
		
		PersonData[] obj=new PersonData[pNum];
		
		for(int i=0;i<pNum;i++) {
			obj[i] = new PersonData();
			obj[i].setFullName();
			obj[i].setAddress();
			obj[i].setAge();
			
			
		}
		for(int i=0;i<pNum;i++) {
			System.out.println("Name of Person is : "+obj[i].getFullName());
			System.out.println("Adresss of Person is : "+obj[i].getAddress());
			System.out.println("Age of Person is : "+obj[i].getAge());
			
			boolean check=obj[i].isAdult(obj[i].age);
			if(check)
				System.out.println(" Person is adult \n");
			else
				System.out.println(" Person is not adult \n");
		}
		
		
	}

}
