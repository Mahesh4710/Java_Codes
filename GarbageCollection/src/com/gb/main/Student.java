package com.gb.main;

public class Student implements Cloneable {
	int rollno;

	public Student(int rollno) {
		super();
		this.rollno = rollno;
	}

	public Student() {
		super();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
