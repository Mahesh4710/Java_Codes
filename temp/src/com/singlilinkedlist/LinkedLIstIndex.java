package com.singlilinkedlist;

public class LinkedLIstIndex {
    private Node head;

    private static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void add(int index, Object data) {
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            current = current.next;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteNode(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
    }
    
    
    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	LinkedLIstIndex myLinkedList = new LinkedLIstIndex();
//    	myLinkedList.add(" 1");
//    	myLinkedList.add(" 2");
//    	myLinkedList.add(" 3");
//    	System.out.println("Before adding: ");
//    	myLinkedList.display();
//
//    	// Add a new element at index 1
//    	myLinkedList.add(1, " 5 ");
//    	
//    	
////    	
//    	
//    	myLinkedList.add(0, "  10  ");
//    	
    	
    	myLinkedList.display();
    	
    	myLinkedList.deleteNode(0);
    	
    	System.out.println("After adding: ");
    	myLinkedList.display();
	}
}



