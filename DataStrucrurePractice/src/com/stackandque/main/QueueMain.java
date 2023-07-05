package com.stackandque.main;

import com.stackandque.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue obj=new Queue(5);
		
		obj.displayQue();
		
		obj.deleteElement();
		
		obj.insertElement(1);
		obj.insertElement(2);
		obj.insertElement(3);
		obj.insertElement(4);
		obj.insertElement(5);
		obj.insertElement(6);
		
		obj.displayQue();
		
		obj.deleteElement();
		obj.insertElement(6);

		obj.displayQue();
	}

}
