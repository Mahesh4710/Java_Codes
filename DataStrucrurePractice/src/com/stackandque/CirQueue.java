package com.stackandque;

public class CirQueue {
	int[] arr;
	int size;
	int rear=-1;
	int front=-1;
	
	public CirQueue(int size) {
		this.size=size;
		arr=new int[size];
	}
	
	public boolean isQueEmpty() {
		if(rear==-1 && front == -1)
			return true;
		return false;
	}
	
	public boolean isQueFull() {
		if((rear+1)%size == front)
			return true;
		return false;
	}
	
	public void displayQue() {
		if(isQueEmpty()) {
			System.out.println("Queue is Empty !");
			return;
		}
		int i=0;
		for( i=front; i!=(rear+1) ; i=(i+1)%size) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[i]);
	}
	
	public void insertElement(int element) {
		if(isQueFull()) {
			System.out.println("Que is Full !");
			return;
		}
		if(front ==-1 && rear==-1) {
			front =front+1;
			rear=rear+1;
		}
		rear=(rear+1)%size;
		
		arr[rear]=element;		
	}
	
	public void deleteElement(){
		if(isQueEmpty()) {
			System.out.println("Queue is Empty !");
			return;
		}
		
		if(rear==front) {
			rear=front=-1;
		}
		front=(front+1)%size;
	}
}
