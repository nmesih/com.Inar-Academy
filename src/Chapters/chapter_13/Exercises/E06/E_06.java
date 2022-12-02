package Chapters.chapter_13.Exercises.E06;

public class E_06 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(6);
        if (circle1.compareTo(circle2) == 1) {
            System.out.println("Circle1 larger than circle2");
        } else if (circle1.compareTo(circle2) == 0) {
            System.out.println("Circle1 and circle2 are equal");
        } else
            System.out.println("Circle2 larger than circle1");
    }
}