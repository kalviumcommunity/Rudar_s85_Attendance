package com.school;

import  java.util.ArrayList;
import  java.util.List;
public class Main {

    public static void main(String[] args) {

        System.out.println("----School Attendance System----");

        Student[] students = new Student[2];
        students[0] = new Student("Rudar");
        students[1] = new Student("Shaurya");
        System.out.println("\n--- Registered Students ---");
        for(int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }


        Course[] courses = new Course[2];
        courses[0] = new Course("OOPs using JAVA");
        courses[1] = new Course("Data Structures");
        System.out.println("\n--- Available Courses ---");
        for(int i = 0; i < courses.length; i++) {
            courses[i].displayDetails();
        }

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[1].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[0].getCourseId(), "Not Present"));

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {

            record.displayRecord();
        }
    }
}
