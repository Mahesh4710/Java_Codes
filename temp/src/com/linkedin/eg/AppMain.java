package com.linkedin.eg;

public class AppMain {

	public static void main(String[] args) {
	
		Stack s = new Stack(4);
		
		s.displayStack();
		
		s.push(5);
		
		s.push(7);
		
		s.pop();
		
		s.push(3);
		
		s.pop();
		s.pop();
		
		s.push(9);
		System.out.println("\nNow all elements from stack : ");
		s.displayStack();
//		
//		if(s.pop() == null)
//			System.out.println("can not pop from empty stack");
	}
}






