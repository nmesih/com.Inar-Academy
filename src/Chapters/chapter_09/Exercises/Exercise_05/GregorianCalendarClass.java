package Chapters.chapter_09.Exercises.Exercise_05;

import java.util.GregorianCalendar;

public class GregorianCalendarClass {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1; //Because index of month started from 0, not 1
        int day = calendar.get(calendar.DAY_OF_MONTH);

        System.out.println("Today is " + day + "/" + month + "/" + year);

        calendar.setTimeInMillis(1234567898765L);
        int year2 = calendar.get(calendar.YEAR);
        int month2 = calendar.get(calendar.MONTH) + 1; //Because index of month started from 0, not 1
        int day2 = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println("Time in milis 1234567898765L = " + day2 + "/" + month2 + "/" + year2);
    }
}
