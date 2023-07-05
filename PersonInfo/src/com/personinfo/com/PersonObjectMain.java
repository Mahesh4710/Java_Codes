package com.personinfo.com;

import java.util.Scanner;

public class PersonObjectMain{
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter the number of persons you want to display:");
		int nPersons = ss.nextInt();
		ss.nextLine(); 
		
		PersonsInfo[] myPersons = new PersonsInfo[nPersons];
		
		for (int i = 0; i < nPersons; i++) {
			System.out.println("Enter name of Person " + (i+1) + ":");
			String name = ss.nextLine();
			
			System.out.println("Enter age of Person " + (i+1) + ":");
			int age = ss.nextInt();
			ss.nextLine(); 
			
			myPersons[i] = new PersonsInfo(name, age);			
		}
		
		System.out.println("Persons details you entered:");
		for (PersonsInfo p : myPersons) {
			System.out.println("Person name is " + p.printName() + ", Age is " + p.printAge());
		}
		
		PersonsInfo oldestPerson = myPersons[0];
		for (int i = 1; i < myPersons.length; i++) {
			if (myPersons[i].printAge() > oldestPerson.printAge()) {
				oldestPerson = myPersons[i];
			}
		}
		System.out.println();
		System.out.println("Oldest Person in the data given by you is :");
		System.out.println("Person name: " + oldestPerson.printName() + ", Age: " + oldestPerson.printAge());
	}
}
