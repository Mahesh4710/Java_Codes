package com.gbgdemo.pojo;



public class ABC {

	private ABC ref;
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("finalize() called");
	}
	
	public static void main(String[] args) {
		
		ABC obj1 = new ABC();
		ABC obj2 = new ABC();
		
		obj1.ref = obj2;
		obj2.ref = obj1;
		
		obj1 = null;
		System.gc();
		obj2 = null;
		System.gc();
		
//		obj1.ref = null;
//		obj2.ref = null;
//		obj1 = null;
//		
//		System.gc();
	}
}
