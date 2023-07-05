package com.user.entity;

import java.util.Scanner;

import com.userlogin.main.UserClass;

public class UserLogigAppMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many users data you want :");
		int nUsers=sc.nextInt();
		sc.nextLine();
		
		UserClass[] userObj=new UserClass[nUsers];
		
		for(int i=0;i<userObj.length;i++) {
			
			System.out.println("Enter the username for user "+ (i+1) +":");
			String username=sc.nextLine();
			System.out.println("Enter the password for user "+ (i+1) +":");
			String password=sc.nextLine();
			
			userObj[i]= new UserClass(username,password);
		}
		
		System.out.println();
		System.out.println("This is login window");
		
		System.out.println("Enter username");
		String enterName=sc.nextLine();
		
		System.out.println("Enter password");
		String enterPassword=sc.nextLine();
		
		int isUsername=-1;
		int isPass=-1;
		
		for(int i=0;i<userObj.length;i++) {
			if(userObj[i].getUsername().equals(enterName)) {
				isUsername=i;
				break;
			}
			
				
		}
		
		if(isUsername==-1) {
			System.out.println("User  not found");
			String status="disbled";
		}
			
		else {
			if(userObj[isUsername].getPassword().equals(enterPassword)) 
				isPass=1;
			
		}
		if(isPass==-1) {
			System.out.println("Password is inncorrect");
			
			System.out.println("Status Disabled");
		}
			
		else
			System.out.println("Welcome, Nice to see you !");
		
		
		System.out.println("Here is all details of users");
		System.out.println();
		for(int i=0;i<userObj.length;i++) {
			 System.out.println("User name of "+(i+1)+" usr is "+userObj[i].getUsername());
			 System.out.println("Password name of "+(i+1)+" usr is "+userObj[i].getPassword());
		}
	}

}
