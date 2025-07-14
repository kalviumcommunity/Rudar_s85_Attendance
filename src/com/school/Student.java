package com.school;

public class Student {
     int StudentId;
     String name;

    public Student setDetails(int StudentId, String name){
        this.StudentId = StudentId;
        this.name = name;

        return this;
    }

    public void displayDetails(){
        System.out.println("Student Id: " + this.StudentId + " Student Name: " + this.name);
    }
}
