package Chapters.chapter_10.Exercises.Exercise_09;

public class TestCourse {
    public static void main(String[] args) {
        Course english = new Course("English");
        english.addStudent("ali");
        english.addStudent("mehmet");
        english.addStudent("erhan");
        english.dropStudent("melih");
        english.dropStudent("mehmet");

        String[] arr = english.getStudents();
        int index = 0;
        while(arr[index] != null) {
            System.out.print(arr[index] + " ");
            index++;
        }
    }
}
