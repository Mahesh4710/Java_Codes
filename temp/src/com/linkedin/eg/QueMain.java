package com.linkedin.eg;

public class QueMain {

	public static void main(String[] args) {
		QueOperation ref=new QueOperation(5);
		
		System.out.println("elements in queue : ");
		ref.display();
		
		System.out.println();
		
		System.out.println(ref.peek());
		
		System.out.println();
		
		ref.deQue();
		
		System.out.println();
		
		ref.enQue(1);
		ref.enQue(2);
		ref.enQue(3);
		ref.enQue(4);
		ref.enQue(5);
		ref.enQue(6);
		
		System.out.println();
		
		ref.display();
		
		ref.deQue();
		ref.deQue();
		ref.deQue();
		
		ref.countElements();
		ref.peek();
		
		ref.display();
	}

}
