package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
     int StudentId;
     String name;

    public Student(String name) {
        this.name = name;
        this.StudentId = nextStudentIdCounter++;
    }

    public void displayDetails(){
        System.out.println("Student Id: " + this.StudentId + " Student Name: " + this.name);
    }
}
