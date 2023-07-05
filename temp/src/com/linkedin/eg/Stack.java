package com.linkedin.eg;

public class Stack {

	private int arr[];
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public boolean isStackEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	} 
	
	public boolean isStackFull() {
		if(top == arr.length - 1)
			return true;
		else
			return false;
	}
	
	public Integer peek() {
		if(isStackEmpty())
			return null;
		
		return arr[top];
	}
	
	public int count() {
		return top + 1;
	}
	
	public void displayStack() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not show"
					+ " elements");
			return;
		}
		
		for(int i = top ; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void push(int element) {
		if(isStackFull()) {
			System.out.println("Stack is full , can not"
					+ " add elements any more");
			return;
		}
		
		top++;
		arr[top] = element;
		System.out.println("push operation performed");
	}
	
	public Integer pop() {
		if(isStackEmpty()) {
			return null;
		}
		
		int element = arr[top];
		top--;
		System.out.println("pop operation performed");
		return element;
	}
}


