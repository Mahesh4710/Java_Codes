package com.practise.entity;



import java.util.Scanner;

public class Student {
    String name;
    String subject;
    int mark;
    public Student next;

    public Student(String name, String subject, int mark) {
        this.name = name;
        this.subject = subject;
        this.mark = mark;
        this.next = null;
    }

    public String toString() {
        return "Name: " + name + ", Subject: " + subject + ", Mark: " + mark;
    }

    public Student mergeSort() {
        if (this == null || this.next == null) {
            return this;
        }
        Student mid = this.getMid();
        Student left = this;
        Student right = mid.next;
        mid.next = null;
        left = left.mergeSort();
        right = right.mergeSort();
        return left.merge(right);
    }

    public Student merge(Student right) {
        Student dummy = new Student("", "", 0);
        Student curr = dummy;
        Student left = this;
        while (left != null && right != null) {
            if (left.mark <= right.mark) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left != null) {
            curr.next = left;
        } else if (right != null) {
            curr.next = right;
        }
        return dummy.next;
    }

    public Student getMid() {
        if (this == null || this.next == null) {
            return this;
        }
        Student slow = this;
        Student fast = this.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

