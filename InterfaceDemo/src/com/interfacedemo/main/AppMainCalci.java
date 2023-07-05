package com.interfacedemo.main;

import com.interfacedemo.entity.Employee;
import com.interfacedemo.entity.Product;

public class AppMainCalci {

	public static void main(String[] args) {
		Employee emp=new Employee("43","Mahesh",5000);
		Product pd=new Product("43",100,500);
		emp.calcTax();
		pd.calcTax();
	}

}
