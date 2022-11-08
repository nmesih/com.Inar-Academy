package Chapters.chapter_10.Exercises.Exercise_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(System.currentTimeMillis());
}
    public Time(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = (int) totalHours % 24;
        this.minute = (int) totalMinutes % 60;
        this.second = (int) totalSeconds % 60;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        hour = (int) totalHours % 24;
        minute = (int) totalMinutes % 60;
        second = (int) totalSeconds % 60;
    }
}
