package com.singlilinkedlist;

public class SListMain {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		System.out.println("All elements from list are : ");
		list.traverseList();
		
		list.addNewNode(10);
		list.addNewNode(20);
		list.addNewNode(30);
		list.addNewNode(40);
		
		System.out.println("Now , all elements from list are : ");
		list.traverseList();
		
		//list.deleteNode(100);
		
//		list.deleteNode(10);
		
//		System.out.println("Now , all elements from list are : ");
//		list.traverseList();
		
//		list.deleteNode(30);
		
//		System.out.println("Now , all elements from list are : ");
//		list.traverseList();

//		list.deleteNode(40);
//		System.out.println("Now , all elements from list are : ");
//		list.traverseList();
		
		list.addNewNodeAfterGiven(40, 50);
		
		System.out.println("Now , all elements from list are : ");
		list.traverseList();
	}
	

}
