package com.miniapp;

import java.util.Scanner;

public class DemoMini {
    static class Node {
        String name;
        String subject;
        int mark;
        Node next;

        Node(String name, String subject, int mark) {
            this.name = name;
            this.subject = subject;
            this.mark = mark;
            this.next = null;
        }
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static Node merge(Node left, Node right) {
        Node dummy = new Node("", "", 0);
        Node curr = dummy;
        while (left != null && right != null) {
            if (left.mark <= right.mark) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left != null) {
            curr.next = left;
        } else if (right != null) {
            curr.next = right;
        }
        return dummy.next;
    }

    public static Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = null;
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
                    head = new Node(name, subject, mark);
                } else {
                    Node curr = head;
                    while (curr.next != null) {
                        curr = curr.next;
                    }
                    curr.next = new Node(name, subject, mark);
                }
            } else if (choice == 2) {
                head = mergeSort(head);
                System.out.println("Sorted list:");
                Node curr = head;
                while (curr != null) {
                    System.out.println("Name: " + curr.name + ", Subject: " + curr.subject + ", Mark: " + curr.mark);
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
