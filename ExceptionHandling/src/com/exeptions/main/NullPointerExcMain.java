package com.exeptions.main;

import com.exeptions.NullPointerExc;

public class NullPointerExcMain {

	
	public static void main(String[] args) {
		NullPointerExc obj=null;
		
		try {
			obj.printData();
		}
		catch(NullPointerException e){
			System.out.println("Obect is null"+e.getMessage());
		}
		System.out.println("Done");
	}

}
