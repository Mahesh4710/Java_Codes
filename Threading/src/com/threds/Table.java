package com.threds;

public class Table extends Thread{
	public synchronized void printTable(int num) {
		
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+"is in printTable");
		
		synchronized(this) {
			try {
				for(int i=1;i<=10;i++) {
					System.out.println(num+ "*"+i +"=" +(num*i));
					Thread.sleep(1500);
				}
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
			
		}
	public static void main(String[] args) {
		Table table=new Table();
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				table.printTable(23);
			}
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				table.printTable(17);
			}
		};
		t1.setName("Lalit");
		t2.setName("Dhiraj");
		t1.start();
		t2.start();
	}
	

}
