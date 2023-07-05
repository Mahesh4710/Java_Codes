package com.threds;
class Table2 implements Runnable {
    private int num;

    public Table2(int num) {
        this.num = num;
    }

    public synchronized void printTable() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printTable();
    }
}