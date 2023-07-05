package com.gb.main;

public class CloneStudentMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(21);
		Student s2=(Student) s1.clone();
		System.out.println(s1.getRollno());
		System.out.println(s2.getRollno());
		
		s1.setRollno(31);
		System.out.println(s1.getRollno());
		System.out.println(s2.getRollno());
	}
}
/*
 * when clone called seperate object is created with same values 
 * for data members that of original
 * 
 * anny changes made to original obj will nnot visible to cloned obj
 * 
 * for class to support cloning Clonnable interface must be implemented
 * 
 */
