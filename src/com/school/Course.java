package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseId = nextCourseIdCounter++;
    }

    public void displayDetails() {
        System.out.println("Course Id: C" + courseId + " Course Name: " + courseName);
    }

}
