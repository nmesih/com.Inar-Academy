package Chapters.chapter_10.Exercises.Exercise_14;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Date is : " + currentDate.getDay() + "/" + (currentDate.getMonth())
            + "/" + currentDate.getYear());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date2 is : " + date2.getDay() + "/" + (date2.getMonth())
                + "/" + date2.getYear());
        date2.setDate(561555550000L);
        System.out.println("Date2 is : " + date2.getDay() + "/" + (date2.getMonth())
                + "/" + date2.getYear());

    }
}
