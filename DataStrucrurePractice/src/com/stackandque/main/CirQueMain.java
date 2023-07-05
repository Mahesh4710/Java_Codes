package com.stackandque.main;

import com.stackandque.CirQueue;

public class CirQueMain {

	public static void main(String[] args) {
		CirQueue obj=new CirQueue(5);
		obj.displayQue();
		
		obj.insertElement(1);
		obj.insertElement(2);
		obj.displayQue();
	}

}
