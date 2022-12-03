package Chapters.chapter_13.Exercises.E13;

import java.util.Arrays;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {

        students[numberOfStudents] = student;
        numberOfStudents--;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course course = (Course) super.clone();
        course.students = students.clone();
        return course;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " \nStudents: " + Arrays.toString(students);
    }
}

