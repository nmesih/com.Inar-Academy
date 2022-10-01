package Chapters.chapter_06;

import java.util.Scanner;

public class C06E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds: ");
        long millis =  input.nextLong();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis){
        String result = "";
        result = currentHour(millis) + ":" + currentMinute(millis) + ":" + currentSecond(millis);
        return result;
    }
    public static long currentHour(long a) {
        long totalHours = ((a / 1000) / 60) / 60;
        return totalHours;
    }

    public static long currentMinute(long a) {
        long totalMinutes = (a / 1000) / 60;
        long minute = totalMinutes % 60;
        return minute;
    }

    public static long currentSecond(long a) {
        long second = (a/1000) % 60;
        return second;
    }
}
