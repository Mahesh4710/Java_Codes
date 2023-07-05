package com.mainapp.main;

import com.overridig.entity.SubClass;
import com.overridig.entity.SupeClass;

public class AppMain {

	public static void main(String[] args) {
		SupeClass ref1=new SupeClass(1,2);
		ref1.show();
		System.out.println();
		SubClass ref2=new SubClass(1,2,3);
		ref2.show();
		System.out.println();
		SupeClass upcast=new SubClass(3,4,5);
		upcast.show();
		SubClass subObj = new SubClass(6, 7, 8);
	    subObj.show();
	}

}
