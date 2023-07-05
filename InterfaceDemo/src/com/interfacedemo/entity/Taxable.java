package com.interfacedemo.entity;

public interface Taxable {
	float salesTax=0.07f;
	float incomeTax=0.105f;
	
	void calcTax();	
}
