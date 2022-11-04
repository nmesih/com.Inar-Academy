package Chapters.chapter_09.Exercises.Exercise_08;

public class TestFan {
    public static void main(String[] args) {

        Fan first = new Fan();
        first.setSpeed(Fan.fast);
        first.setRadius(10);
        first.setColor("yellow");
        first.setOn(true);

        Fan second = new Fan();
        first.setSpeed(Fan.medium);
        first.getRadius();
        first.getColor();
        first.isOn();

        System.out.println(first.toString());
        System.out.println("----------");
        System.out.println(second.toString());
    }
}
