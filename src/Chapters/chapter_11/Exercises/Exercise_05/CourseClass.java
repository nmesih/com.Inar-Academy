package Chapters.chapter_11.Exercises.Exercise_05;

import java.util.ArrayList;

public class CourseClass {

    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public CourseClass(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        if(students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        }else
            System.out.println("There is no student named " + student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] array1 = new String[students.size()];
        return students.toArray(array1);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}


