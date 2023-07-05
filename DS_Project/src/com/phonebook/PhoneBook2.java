package com.phonebook;

import java.util.Scanner;

public class PhoneBook2 {
    Node head;
//    Scanner sc=new Scanner(System.in);
    

//    PhoneBook() {
//        this.sc = new Scanner(System.in);
//    }
    public class Node {
        String name;
        String email;
        String phno;
        Node prev;
        Node next;

        public Node(String name, String email, String phno) {
            this.name = name;
            this.email = email;
            this.phno = phno;
            this.prev = null;
            this.next = null;
        }
    }
    public void display() {
        Node current = this.head;
        if (current == null) {
            System.out.println("Phone book is empty.");
        } else {
            while(current != null) {
                System.out.println("Name: " + current.name);
                System.out.println("Email: " + current.email);
                System.out.println("Phone number: " + current.phno);
                System.out.println("-----------------------");
                current = current.next;
            }

        }
    }

    public void insert() {
    	Scanner sc=new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phno = sc.nextLine();
        Node new_contact = new Node(name, email, phno);
        if (this.head == null) {
            this.head = new_contact;
        } else {
            Node current;
            for(current = head; current.next != null; current = current.next) {
            }

            current.next = new_contact;
            new_contact.prev = current;
        }
    }

    public void update() {
        System.out.print("Enter name to update details: ");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();

        for(Node current = head; current != null; current = current.next) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new email address: ");
                String email = sc.nextLine();
                System.out.print("Enter new phone number: ");
                String phno = sc.nextLine();
                current.email = email;
                current.phno = phno;
                System.out.println("Details updated for " + name);
                return;
            }
        }

        System.out.println(name + " is not in the phone book.");
    }

    public void delete() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        Node current = head;
        if (current == null) {
            System.out.println("Phone book is empty.");
        } else if (current.name.equalsIgnoreCase(name)) {
            this.head = current.next;
            if (current.next != null) {
                current.next.prev = null;
            }

            System.out.println(name + " has been deleted from the phone book.");
        } else {
            while(current != null) {
                if (current.name.equalsIgnoreCase(name)) {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }

                    System.out.println(name + " has been deleted from the phone book.");
                    return;
                }

                current = current.next;
            }

            System.out.println(name + " is not in the phone book.");
        }
    }

    public void delete_same_name() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name to delete all contacts: ");
        String name = sc.nextLine();
        Node current = head;

        boolean deleted;
        for(deleted = false; current != null; current = current.next) {
            if (current.name.equalsIgnoreCase(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                deleted = true;
            }
        }

        if (deleted) {
            System.out.println("All contacts with name " + name + " have been deleted.");
        } else {
            System.out.println("No contacts with name " + name + " found.");
        }

    }

    public void delete_same_phno() {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter phone number to delete all contacts: ");
        String phno = sc.nextLine();
        Node current = head;

        boolean deleted;
        for(deleted = false; current != null; current = current.next) {
        	
            if (current.phno.equals(phno)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                deleted = true;
            }
        }

        if (deleted) {
            System.out.println("All contacts with phone number " + phno + " have been deleted.");
        } else {
            System.out.println("No contacts with phone number " + phno + " found.");
        }

    }

    public void search_name() {
    	Scanner sc=new Scanner(System.in);

        System.out.print("Enter name to search for: ");
        String name = sc.nextLine();
        Node current = head;

        boolean found;
        for(found = false; current != null; current = current.next) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Name: " + current.name);
                System.out.println("Email: " + current.email);
                System.out.println("Phone number: " + current.phno);
                System.out.println("-----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts with name " + name + " found.");
        }

    }

    public void search_email() {
    	Scanner sc=new Scanner(System.in);

        System.out.print("Enter email to search for: ");
        String email = sc.nextLine();
        Node current = head;

        boolean found;
        for(found = false; current != null; current = current.next) {
            if (current.email.equalsIgnoreCase(email)) {
                System.out.println("Name: " + current.name);
                System.out.println("Email: " + current.email);
                System.out.println("Phone number: " + current.phno);
                System.out.println("-----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts with email " + email + " found.");
        }

    }

    void searchByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phno = scanner.nextLine();
        Node current = head;

        boolean found;
        for(found = false; current != null; current = current.next) {
            if (current.phno.equals(phno)) {
                System.out.println("Name: " + current.name);
                System.out.println("Email: " + current.email);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}