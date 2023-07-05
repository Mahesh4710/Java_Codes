package com.students.entity;

public abstract class Student {
	int rollno;
	float percentage;
	public Student(int rollno, float percentage) {
		super();
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	 public abstract void show() ;
}
