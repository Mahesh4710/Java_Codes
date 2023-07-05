package com.linkedin.eg;

public class QueOf10Main  {
	public static void main(String[] args) {
		QueOfTen ref=new QueOfTen();
		
		System.out.println("elements in queue : ");
		ref.display();
		System.out.println();
		
		ref.enQue(6);
		
		ref.display();
		
		ref.enQue(7);
		ref.enQue(8);
		ref.display();
		
		ref.deQue();
		ref.deQue();
		ref.deQue();
		ref.display();
	}


}
