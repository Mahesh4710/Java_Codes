package com.threds;



public class DeadlockDemo {

	private String name1 = "Amit";
	private String name2 = "Sumit";
	
	public void lock1() {
		System.out.println("t1 wants to acquire lock on name1");
		synchronized (name1) {
			System.out.println("t1 has acquired lock on name1");
			System.out.println("t1 wants to acquire lock on name2");
				synchronized (name2) {
					System.out.println("t1 acquired lock on name2");
				}
		}
	}
	
	public void lock2() {
		System.out.println("t2 wants to acquire lock on name2");
		synchronized (name1) {
			System.out.println("t2 has acquired lock on name2");
			System.out.println("t2 wants to acquire lock on name1");
				synchronized (name2) {
					System.out.println("t2 acquired lock on name1");
				}
		}
	}
	public static void main(String[] args) {

		DeadlockDemo obj = new DeadlockDemo();
		
		Thread t2 = new Thread(() -> obj.lock2());
		
		Thread t1 = new Thread(() -> obj.lock1());
		
		
		t2.start();
		t1.start();
		
	}
}
