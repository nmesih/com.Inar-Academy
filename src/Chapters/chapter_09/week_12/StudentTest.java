package Chapters.chapter_09.week_12;

import Chapters.chapter_09.week_12.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student nurullah = new Student();

        nurullah.setEmail("nurullah@inar.com");
        nurullah.setId(1106);
        nurullah.surname = nurullah.getSurname();
        nurullah.name = "Nurullah";

        nurullah.print();
        System.out.println("\n------------");

        Student ali = new Student("Ali", "Ozturk" , 282, "aliozturk@gmail.com");
        ali.print();

        System.out.println("\n------------");
        nurullah.setSurname("al");
        nurullah.print();
    }
}
