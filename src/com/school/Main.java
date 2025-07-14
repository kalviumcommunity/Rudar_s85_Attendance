package com.school;

public class Main {

    public static void main(String[] args) {

        System.out.println("----School Attendance System----");

        Student[] students = new Student[2];
        students[0] = new Student().setDetails(1, "Rudar");
        students[1] = new Student().setDetails(2, "Shaurya");
        System.out.println("Registered Students:");
        for(int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }


        Course[] courses = new Course[2];
        courses[0] = new Course().setDetails(1, "OOPs using JAVA");
        courses[1] = new Course().setDetails(2, "Data Structures");
        System.out.println("Available Courses:");
        for(int i = 0; i < courses.length; i++) {
            courses[i].displayDetails();
        }


    }
}
