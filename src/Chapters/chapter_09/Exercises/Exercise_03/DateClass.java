package Chapters.chapter_09.Exercises.Exercise_03;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date date = new Date();

        for (long i = 10000; i < 100_000_000_000L; i *= 10) {
            date.setTime(i);
            System.out.println("date and time when elapsed time is " +
                    i + ", date and time: " + date.toString());
        }
    }
}
