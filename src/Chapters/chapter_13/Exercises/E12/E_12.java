package Chapters.chapter_13.Exercises.E12;

import Chapters.chapter_13.Listings.Circle;
import Chapters.chapter_13.Listings.GeometricObject;
import Chapters.chapter_13.Listings.Rectangle;

public class E_12 {
    public static void main(String[] args) {
        GeometricObject[] a = {new Circle(5), new Circle(6),
                new Rectangle(3, 4), new Rectangle(9,10)};

        System.out.printf("The sum area of geometric objects is %.2f", sumArea(a));
    }

    public static double sumArea(GeometricObject[] a){
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }

        return sum;
    }
}
