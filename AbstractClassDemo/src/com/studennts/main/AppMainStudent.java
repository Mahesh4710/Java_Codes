package com.studennts.main;

import com.students.entity.CollegeStudent;
import com.students.entity.SchoolStudent;
import com.students.entity.Student;

import java.util.Scanner;

public class AppMainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        students[0] = new CollegeStudent(1, 80, 1, "First year");
        students[1] = new CollegeStudent(2, 75, 2, "Second year");
        students[2] = new SchoolStudent(3, 90, 10, "10th");
        students[3] = new SchoolStudent(4, 85, 12, "12th");
        students[4] = new SchoolStudent(5, 70, 8, "8th");

   
        for (Student student : students) {
            student.show();
            System.out.println();
        }
    }
}
