package com.threds;

public class JoinDemo extends Thread{
	@Override
	public void run() {
		System.out.println("hi");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("HELLO");
		
	}
	public static void main(String[] args) {
		JoinDemo t1=new JoinDemo();
		JoinDemo t2=new JoinDemo();
		t1.start();
		try {
			t1.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
