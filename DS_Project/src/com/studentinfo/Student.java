package com.studentinfo;

public class Student {
	private String name;
	private String subject;
	private int mark;

	public Student(String name, String subject, int mark) {
	    this.name = name;
	    this.subject = subject;
	    this.mark = mark;
	}

	public String getName() {
	    return name;
	}

	public String getSubject() {
	    return subject;
	}

	public int getMark() {
	    return mark;
	}


}
