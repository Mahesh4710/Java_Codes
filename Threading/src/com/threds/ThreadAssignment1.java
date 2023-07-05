package com.threds;

public class ThreadAssignment1 extends Thread{
	
	
	public static void main(String[] args) {
		
		ThreadAssignment1 a1=new ThreadAssignment1();
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				a1.getName();
			}
		};				
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				a1.getName();
			}
		};	
	}

}
