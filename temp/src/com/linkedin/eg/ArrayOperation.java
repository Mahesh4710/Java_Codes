package com.linkedin.eg;

public class ArrayOperation {
	int arr[];
	private int size;
	
	public ArrayOperation(int[] arr,int size){
		this.arr=arr;
		this.size=size;
	}
	void tranverse(){
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	void insertElement(int position,int element){
		if(position>=size || position<1) {
			System.out.println("Invalid position");
		}
		for(int i=size;i>=position-1;i++) {
			arr[i+1]=arr[i];
		}
		arr[position-1]=element;
		size++;
		
		System.out.println("Element inserted :");
	}
	
	public void deleteElement(int position) {
		if(size==0 ) {
			System.out.println("Empty array");
		}
		
		if(position<1 || position>=size) {
			System.out.println("Invalid position");
		}
		for(int i=position-1;i<size;i++) {
			arr[i]=arr[i+1];
		}
	}
	public static void main(String[] args) {
		int[] arr= {12,23,34,56,67,0,0,0,0,0};
		
		
		ArrayOperation obj=new ArrayOperation(arr,5);
		
		System.out.println("Initially array is :");
		obj.tranverse();
		
		obj.insertElement(3,99);
		obj.tranverse();
	}
}

