package Chapters.chapter_10.Exercises.Exercise_12;

import Chapters.chapter_10.Exercises.Exercise_04.MyPoint;

public class TestTriangle {
    public static void main(String[] args) {
        /*Draw the UML diagram for the class and then implement the class. Write
        a test program that creates a Triangle2D objects t1 using the constructor
        new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
        new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
        result of t1.contains(3, 3), r1.contains(new Triangle2D(new
        MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1.
        overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,
        -3), MyPoint(2, 6.5)))*/

        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area of the t1 " + t1.getArea() +"\nPerimeter of the t1 " + t1.getPerimeter());
        System.out.println(t1.contains(new MyPoint(3, 3)));

        System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));

        System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,-3), new MyPoint(2, 6.5))));

    }
}
