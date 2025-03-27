package com.bridgelabz.universitymanagement;

class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, String department, int examWeightage) {
        super(courseName, department);
        this.examWeightage = examWeightage;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam-Based Course: " + getCourseName() + " | Department: " + getDepartment() + " | Exam Weightage: " + examWeightage + "%");
    }
}
