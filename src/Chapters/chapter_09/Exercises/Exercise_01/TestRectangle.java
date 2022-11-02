package Chapters.chapter_09.Exercises.Exercise_01;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width and height of the first rectangle");
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        Rectangle FirstRectangle = new Rectangle(width1,height1);

        System.out.println("A rectangle with a width of " + FirstRectangle.width + " and a height of " +
                FirstRectangle.height + " has an area of " + FirstRectangle.getArea());
        System.out.println("A rectangle with a width of " + FirstRectangle.width + " and a height of " +
                FirstRectangle.height + " has an area of " + FirstRectangle.getPerimeter());

    }
}
