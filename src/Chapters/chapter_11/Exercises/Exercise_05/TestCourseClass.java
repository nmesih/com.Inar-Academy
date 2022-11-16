package Chapters.chapter_11.Exercises.Exercise_05;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCourseClass {
    public static void main(String[] args) {
        CourseClass course = new CourseClass("Java");
        course.addStudent("Nuri");
        course.addStudent("Ali");
        course.addStudent("Veli");
        course.addStudent("Arda");
        System.out.println(Arrays.toString(course.getStudents()));

        course.dropStudent("Mehmet");
        course.dropStudent("Arda");
        System.out.println(course.getNumberOfStudents());

        System.out.println(Arrays.toString(course.getStudents()));
    }
}
