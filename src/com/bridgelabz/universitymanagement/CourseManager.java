package com.bridgelabz.universitymanagement;

import java.util.List;

class CourseManager {
    // Using wildcard to accept any type of CourseType
    public static void displayAllCourses(List<? extends CourseType> courses) {
        System.out.println("\n--- University Courses ---");
        for (CourseType course : courses) {
            course.displayCourseDetails();
        }
    }
}
