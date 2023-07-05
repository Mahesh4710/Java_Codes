package com.thread.assignmennt;

public class ThreadingAssgnt2 extends Thread{
	
	void printMyessege() {
		System.out.println("HelloWorld! , from Mahesh Patil.");
	}

	public static void main(String[] args) {
		
		ThreadingAssgnt2 a2=new ThreadingAssgnt2();
		
		Thread t1= new Thread() {
			
			@Override
			public void run() {
				a2.printMyessege();
			}
		};
		t1.start();
	}

}
