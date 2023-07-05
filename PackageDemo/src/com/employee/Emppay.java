package com.employee;

public class Emppay {

	public static void main(String[] args) {
		Emp myemployee = new Emp("Mahesh", 12345, 1, 50000.0);
		myemployee.allowance = 2000.0;
		myemployee.calculate();
		myemployee.display();

	}

}
