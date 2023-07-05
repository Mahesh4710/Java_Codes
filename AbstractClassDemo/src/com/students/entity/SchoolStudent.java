package com.students.entity;

import com.students.entity.Student;

public class SchoolStudent extends Student {
    int semester;
    String className;

    public SchoolStudent(int rollno, float percentage, int semester, String className) {
        super(rollno, percentage);
        this.semester = semester;
        this.className = className;
    }

    public SchoolStudent(int rollno, float percentage) {
        super(rollno, percentage);
    }

    @Override
    public void show() {
        //super.show();
        System.out.println("Semester: " + semester);
        System.out.println("Class name: " + className);
    }
}