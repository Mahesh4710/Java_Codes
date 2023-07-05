package com.circularqueue;

public class CircularQueue {
	private int arr[];
	private int capacity;
	private int rear,front;
	
	public CircularQueue(int size) {
		capacity=size;
		arr=new int[size];
		rear=front=-1;
		
	}
	
	public boolean isQueEmpty() {
		if(front==-1 && rear==-1) 
			return true;
		
		else
			return false;
	}
	
	public boolean isQueFull() {
	if((rear+1)%capacity == front)
		return true;
	else
		return false;
	}
	
	void enQue(int element) {
		if(isQueFull()) {
			System.out.println("Sorry Queue is full.");
			return;
		}
		
		if(isQueEmpty()) {
			front=rear=0;
		}
		else
			rear=(rear+1)%capacity;
		arr[rear]=element;
		System.out.println("Element Enqued successfully!");
	}
	
	
	public Integer deQue() {
		if(isQueEmpty()) {
			System.out.println("Sorry Queue is already empty.");
			return null;
		}
		int element=arr[rear];
		
		if(front==rear) {
			front=rear=-1;
			return element;
		}
		
		front=(front+1)%capacity;
		
		return element;
	}
	
	void display() {
		if(isQueEmpty()) {
			System.out.println("Sorry Queue is empty!");
			return;
		}
		int i;
		for(i = front ; i != rear ; i = (i + 1) % capacity) {
			System.out.print(arr[i] + " ");
		}
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	
}
