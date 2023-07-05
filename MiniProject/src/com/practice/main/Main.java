package com.practice.main;

import java.util.Scanner;

import com.practise.entity.Student;


public class Main {
    public static void main(String[] args) {
        Student head = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add student to list");
            System.out.println("2. Sort and display list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.next();
                System.out.print("Enter subject: ");
                String subject = sc.next();
                System.out.print("Enter mark: ");
                int mark = sc.nextInt();
                if (head == null) {
                    head = new Student(name, subject, mark);
                } else {
                    Student curr = head;
                    while (curr.next != null) {
                        curr = curr.next;
                    }
                    curr.next = new Student(name, subject, mark);
                }
            } else if (choice == 2) {
                head = head.mergeSort();
                System.out.println("Sorted list:");
                Student curr = head;
                while (curr != null) {
                    System.out.println(curr);
                    curr = curr.next;
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        sc.close();
    }
}
