package Chapters.chapter_06;

public class C06E24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("Current time is " + currentHour(totalMilliseconds) + ":"
                + currentMinute(totalMilliseconds) + ":" + currentSecond(totalMilliseconds) + " GMT");
    }


    public static long currentHour(long a) {
        long totalHours = ((a / 1000) / 60) / 60;
        long currentHour = totalHours % 24;
        return currentHour;
    }

    public static long currentMinute(long a) {
        long totalMinutes = (a / 1000) / 60;
        long currentMinute = totalMinutes % 60;
        return currentMinute;
    }

    public static long currentSecond(long a) {
        long totalSeconds = a / 1000;
        long second = totalSeconds % 60;
        return second;
    }

}
