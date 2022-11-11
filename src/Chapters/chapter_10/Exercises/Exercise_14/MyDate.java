package Chapters.chapter_10.Exercises.Exercise_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar g = new GregorianCalendar();
        g.setTimeInMillis(elapsedTime);
        this.year = g.get(g.YEAR);
        this.month = g.get(g.MONTH);
        this.day = g.get(g.DAY_OF_MONTH);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar set = new GregorianCalendar();
        set.setTimeInMillis(elapsedTime);
        year = set.get(GregorianCalendar.YEAR);
        month = set.get(GregorianCalendar.MONTH);
        day = set.get(GregorianCalendar.DAY_OF_MONTH);
    }
}

