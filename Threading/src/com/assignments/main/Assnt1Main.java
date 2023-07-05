package com.assignments.main;

import com.thread.assignmennt.ThreadingAssgnt1;

public class Assnt1Main {
	public static void main(String[] args) {
		ThreadingAssgnt1 runnable = new ThreadingAssgnt1();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();

        System.out.println("Thread names are following:");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
	}
}
