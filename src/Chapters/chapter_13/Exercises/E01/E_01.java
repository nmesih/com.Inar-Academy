package Chapters.chapter_13.Exercises.E01;

import Chapters.chapter_13.Listings.GeometricObject;

public class E_01 {
    public static void main(String[] args) {
        GeometricObject triangle = new Triangle();
        System.out.println(triangle.toString());

        System.out.println("\n------------------\n");

        Triangle triangle1 = new Triangle("Yellow",true,3,4,5);
        System.out.println(triangle1.toString());
    }

}
