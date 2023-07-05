package com.stackandque;

public class Queue {
	int arr[];
	int size;
	int rear=-1;
	
	public Queue(int size) {
		this.size=size;
		arr=new int[size];
	}
	
	public boolean isQueEmpty() {
		if(rear==-1)
			return true;
		return false;
	}
	
	public boolean isQueFull() {
		if(rear==size-1)
			return true;
		return false;
	}
	
	public void displayQue() {
		if(isQueEmpty()) {
			System.out.println("Queue is Empty !");
			return;
		}
		
		for(int i=0;i<=rear;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void insertElement(int element) {
		
		if(isQueFull()) {
			System.out.println("Queue is full , cant insert ");
			return;
		}
		
		rear++;
		arr[rear]=element;
	}
	
	public void deleteElement() {
		if(isQueEmpty()) {
			System.out.println("Que is already empty !");
			return;
		}
		
		for(int i=0;i<=rear-1;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
	}

}
