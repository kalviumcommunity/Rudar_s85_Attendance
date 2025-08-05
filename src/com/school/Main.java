package com.school;

public class Main {

    public static void main(String[] args) {

        System.out.println("----School Attendance System----");

        Student[] students = new Student[2];
        students[0] = new Student("Rudar");
        students[1] = new Student("Shaurya");
        System.out.println("Registered Students:");
        for(int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }


        Course[] courses = new Course[2];
        courses[0] = new Course("OOPs using JAVA");
        courses[1] = new Course("Data Structures");
        System.out.println("Available Courses:");
        for(int i = 0; i < courses.length; i++) {
            courses[i].displayDetails();
        }

        // Demonstrate auto-ID generation with new instances
        System.out.println("\n--- Auto-ID Generation Test ---");
        System.out.println("Creating one more student and course...");
        Student student3 = new Student("Charlie Chaplin");
        Course course3 = new Course("Data Structures");

        System.out.print("New Student: ");
        student3.displayDetails();
        System.out.print("New Course: ");
        course3.displayDetails();

        System.out.println("\nSession 3: Constructor Initialization & Auto-ID Generation Complete.");

    }
}
