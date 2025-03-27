package com.bridgelabz.universitymanagement;

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void displayCourse() {
        courseType.displayCourseDetails();
    }
}
