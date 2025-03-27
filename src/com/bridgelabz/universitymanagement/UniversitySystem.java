package com.bridgelabz.universitymanagement;

import java.util.*;


public class UniversitySystem {
    public static void main(String[] args) {
        // Creating different courses
        ExamCourse mathExam = new ExamCourse("Mathematics 101", "Science", 70);
        AssignmentCourse historyAssignment = new AssignmentCourse("History of Civilizations", "Arts", 5);
        ResearchCourse aiResearch = new ResearchCourse("AI Innovations", "Computer Science", "Machine Learning");

        // Wrapping them in generic Course class
        Course<ExamCourse> examCourse = new Course<>(mathExam);
        Course<AssignmentCourse> assignmentCourse = new Course<>(historyAssignment);
        Course<ResearchCourse> researchCourse = new Course<>(aiResearch);

        // Display individual courses
        System.out.println("\n--- Individual Course Details ---");
        examCourse.displayCourse();
        assignmentCourse.displayCourse();
        researchCourse.displayCourse();

        // Store all courses in a list and use wildcard method
        List<CourseType> allCourses = Arrays.asList(mathExam, historyAssignment, aiResearch);
        CourseManager.displayAllCourses(allCourses);
    }
}
/*--- Individual Course Details ---
Exam-Based Course: Mathematics 101 | Department: Science | Exam Weightage: 70%
Assignment-Based Course: History of Civilizations | Department: Arts | Assignments: 5
Research-Based Course: AI Innovations | Department: Computer Science | Research Topic: Machine Learning

--- University Courses ---
Exam-Based Course: Mathematics 101 | Department: Science | Exam Weightage: 70%
Assignment-Based Course: History of Civilizations | Department: Arts | Assignments: 5
Research-Based Course: AI Innovations | Department: Computer Science | Research Topic: Machine Learning
 */