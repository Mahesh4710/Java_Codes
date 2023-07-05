package com.threds;

public class Table2Main {
	 public static void main(String[] args) {
	        // Create three threads
	        Thread t1 = new Thread(new Table2(23));
	        Thread t2 = new Thread(new Table2(17));
	        Thread t3 = new Thread(new Table2(10));

	        // Set priorities for the threads
	        t1.setPriority(10);
	        t2.setPriority(5);
	        t3.setPriority(1);

	        // Start the threads
	        t1.start();
	        t2.start();
	        t3.start();

	        // Display the order of thread execution using a for loop
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Loop " + i + " completed");
	        }
	    }

}
