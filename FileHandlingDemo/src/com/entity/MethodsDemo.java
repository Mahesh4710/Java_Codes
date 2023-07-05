package com.entity;
import java.io.File;
import java.util.Date;

public class MethodsDemo {
	
	void MethodsCheck(){
		File f1=new File(
				"C:\\javaprg\\Demo.class");
		System.out.println("name of file : " + f1.getName());
		System.out.println("path of file : " + f1.getPath());
		System.out.println("parent folder of file : " + f1.getParent());
		System.out.println("size of file : " + f1.length());
		System.out.println("is f1 a file : " + f1.isFile());
		System.out.println("is f1 a folder : " + f1.isDirectory());
		System.out.println("does f1 exist in your system : " + f1.exists());
		System.out.println("is f1 readable : " + f1.canRead());
		System.out.println("is f1 writable : " + f1.canWrite());
		System.out.println("is f1 executable : " + f1.canExecute());
		long milis = f1.lastModified();
		Date d = new Date(milis);
		System.out.println("the file was last modified on : " + d);
	}
	public static void main(String[] args) {
		MethodsDemo ok1=new MethodsDemo();
		ok1.MethodsCheck();
	}		
}
