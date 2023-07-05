package com.interfacedemo.entity;

public class Product implements Taxable{
	String pid;
	int price,quantity;
	public Product(String pid,int price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	@Override
	public void calcTax() {
		double salesTaxAmount = price * salesTax * quantity;
        System.out.println("Product: " + pid + " has a sales tax of " + salesTaxAmount);
		
	}

}
