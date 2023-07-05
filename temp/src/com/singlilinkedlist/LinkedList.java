package com.singlilinkedlist;

public class LinkedList {

	private Node head;
	
		private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void traverseList() {
		if(head == null) {
			System.out.println("list is empty , can not display");
			return;
		}
		
		if(head.next == null) {
			System.out.println(head.data);
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public void addNewNode(int data) {
		
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			//head.next=null;
			System.out.println("new node added");
			return;
		}
		
		Node temp = head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		
		temp.next = n;
		
		//n.next = null; optional step
		System.out.println("new node added");
	}
	
	
	public void addNewNodeAfterGiven(int value , int new_value) {
		
		Node n = new Node(new_value);
		
				
		
		if(head == null) {
			System.out.println("no nodes available");
			return;
		}
		
		Node temp = head;
		while(temp != null && temp.data != value) {
			temp = temp.next;
		}
		
		if(temp != null) {
			n.next = temp.next;
			temp.next = n;
			System.out.println("node added");
			return;
		}
		
		if(temp == null) {
			System.out.println("no such node found");
			return;
		}
	}
	
	
	public void deleteNode(int value) {

		Node temp = null;
		Node prev = null;
		
		if(head == null) {
			System.out.println("list is empty , can not delete");
			return;
		}
		
		//below code runs when element to be deleted is at the first node
		if(head.data == value) {
			//Node temp = head; optional step
			head = head.next;
			//temp.next = null; optional step
			System.out.println("node deleted");
			return;
		}

		//node to be deleted is somewhere else
		temp = head;
		
		while(temp != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		
		//below code runs if element is found
		if(temp != null) {
			prev.next = temp.next;
			temp.next = null;
			System.out.println("node deleted");
			return;
		}
		
		//below code runs if element is not found
		if(temp == null) {
			System.out.println("no such element found");
			return;
		}
	}
}











