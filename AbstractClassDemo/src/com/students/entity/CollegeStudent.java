package com.students.entity;

import com.students.entity.Student;

public class CollegeStudent extends Student {
    int semester;
    String className;

    public CollegeStudent(int rollno, float percentage) {
        super(rollno, percentage);
    }

    public CollegeStudent(int rollno, float percentage, int semester, String className) {
        super(rollno, percentage);
        this.semester = semester;
        this.className = className;
    }

    @Override
    public void show() {
        //super.show();
        System.out.println("Semester: " + semester);
        System.out.println("Class name: " + className);
    }
}