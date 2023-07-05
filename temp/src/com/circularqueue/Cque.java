package com.circularqueue;

import java.util.Scanner;

public class Cque {

	public static void main(String[] args) {
		System.out.println("Welcome from Mahesh");
		
		System.out.println("Enter the size of Queue you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CircularQueue cq=new CircularQueue(n);
		int repeat=1;
		System.out.println();
		
		
		
		do {
			System.out.println("*********************************");
			
			System.out.println("Enter your choice");
			System.out.println("\n 1.Display Queue \n 2.Add element in queue \n 3.Delete the first iserted element in queue ");
			int key=sc.nextInt();
			System.out.println("*********************************");

			switch (key) {
			case 1:
				System.out.println();
				System.out.println("Elements are : " );
				cq.display();
				
				break;
			case 2:
				System.out.println();
				System.out.println("Enter element to add in queue ");
				int ele=sc.nextInt();
				cq.enQue(ele);
				
				break;
				
			case 3:
				System.out.println();
				System.out.println("Before deque elemennts are:");
				cq.display();
				
				cq.deQue();
				System.out.println("Elemets after dequeue ar:");
				cq.display();
				
				break;

			default:
				System.out.println();
				System.out.println("Enter proper choice");
				break;
			}
			System.out.println();
			System.out.println("Do you want to perform operations on Queue again.");
			System.out.println("1. Enter 1 to continue \n 2.Ennter 0 to exit");
			
			repeat=sc.nextInt();
		} while (repeat!=0);
		System.out.println();
		System.out.println("Thank you for using Queue.");
	}

}
