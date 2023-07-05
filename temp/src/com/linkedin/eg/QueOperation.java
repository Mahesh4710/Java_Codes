package com.linkedin.eg;

public class QueOperation {
	
	private int[] arr;
	private int size;
	private int rear;

	public QueOperation(int size) {
		this.size=size;
		arr=new int[size];
		rear=0;
	}
	
	public boolean isQueEmpty() {
		if(rear==0)
			return true;
		else
			return false;
	}
	
	public boolean isQueFull() {
		if(rear==size)
			return true;
		else
			return false;
	}
	
	public Integer peek() {
		if(isQueEmpty())
			return null;
		return arr[0];
		
	}
	
	public int countElements() {
		return rear;
	}
	
	public void display() {
		if(isQueEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		for(int i=0;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void enQue(int element) {
		if(isQueFull()) {
			System.out.println("Sorry Queue is full.");
			return;
		}
		arr[rear]=element;
		rear++;
		System.out.println("Element Enqueued successfully!");
	}

	public Integer deQue() {
		if(isQueEmpty()) {
			System.out.println("Queue is already empty.");
			return null;
		}
		
		int element=arr[0];
		
		for(int i=0;i<rear-1;i++) {
				arr[i]=arr[i+1];
		}
		rear--;
		System.out.println("Elements Dequeued.");
		return element;
	}
}

