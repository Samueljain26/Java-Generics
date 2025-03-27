package com.bridgelabz.universitymanagement;

class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String department, String researchTopic) {
        super(courseName, department);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Research-Based Course: " + getCourseName() + " | Department: " + getDepartment() + " | Research Topic: " + researchTopic);
    }
}
