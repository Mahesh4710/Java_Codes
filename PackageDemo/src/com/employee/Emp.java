package com.employee;

public class Emp {
    String name;
    int empid, category;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    public Emp(String name, int empid, int category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }

    public void calculate() {
        hra = 0.3 * bpay;
        da = 0.2 * bpay;
        npay = bpay + hra + da;
        pf = 0.1 * bpay;
        grosspay = npay + allowance;
        incometax = (grosspay - pf) * 0.2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + npay);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Income Tax: " + incometax);
    }
}
