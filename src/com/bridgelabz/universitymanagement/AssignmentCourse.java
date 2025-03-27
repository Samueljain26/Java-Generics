package com.bridgelabz.universitymanagement;

class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, String department, int numberOfAssignments) {
        super(courseName, department);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Assignment-Based Course: " + getCourseName() + " | Department: " + getDepartment() + " | Assignments: " + numberOfAssignments);
    }
}
