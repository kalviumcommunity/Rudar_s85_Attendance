package com.school;

public class Course {
    private int courseId;
    private String courseName;

    public Course setDetails(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;

        return this;
    }

    public void displayDetails() {
        System.out.println("Course Id: " + courseId + " Course Name: " + courseName);
    }

}
