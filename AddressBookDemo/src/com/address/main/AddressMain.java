package com.address.main;

import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("How many persons adress you want to store : ");
		int nPersons=ip.nextInt();
		
		AddressPojo[] personobj=new AddressPojo[nPersons]; 
		
		for(int i=0;i<personobj.length;i++) {
			System.out.println("Enter the name of Person "+(i+1)+":");
			String name=ip.next();
			
			System.out.println("Enter the streetAddress of Person "+(i+1)+":");
			String streetAddress=ip.next();
			
			System.out.println("Enter the city of Person "+(i+1)+":");
			String city=ip.next();
			
			System.out.println("Enter the state of Person "+(i+1)+":");
			String state=ip.next();
			
			System.out.println("Enter the ZIPcode of Person "+(i+1)+":");
			String ZIPcode=ip.next();
			
			personobj[i]=new AddressPojo(name, streetAddress, city, state, ZIPcode);
			
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Which person address you want to search :");
		System.out.println();
		for(int i=0;i<personobj.length;i++) {
			System.out.println((i+1)+":"+personobj[i].getName());
			
		}
		System.out.println("Enter name from above list");
		String find=ip.next();
		int isName=-1;
		for(int i=0;i<personobj.length;i++) {
			if(personobj[i].getName().equals(find)) {
				isName=i;
				break;
			}
			
		}
		if(isName==-1)
			System.out.println("Name is not present :");
		else {
			System.out.println("streetAddress of Person "+(isName+1)+":"+personobj[isName].getStreetAddress());
			System.out.println("city of Person "+(isName+1)+":"+personobj[isName].getCity());
			System.out.println("state of Person "+(isName+1)+":"+personobj[isName].getState());
			System.out.println("ZIPcode of Person "+(isName+1)+":"+personobj[isName].getZIPcode());
		}
		
	}

}
