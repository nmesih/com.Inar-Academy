package Chapters.chapter_11.Exercises.Exercise_01;

import java.util.Scanner;

public class E_01 {
    public static void main(String[] args) {

        Triangle t1 = getInputsFromUser();

        System.out.println("Your triangle\nArea      : " + t1.getArea() +
                "\nPerimeter: " + t1.getPerimeter() + "\nColor     : " +
                t1.getColor() + "\nIs filled? " + t1.isFilled());

    }

    private static Triangle getInputsFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sides of triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of the triangle:");
        String color = input.next();

        System.out.println("Is the triangle filled? (Yes/No)");
        String str = input.next();
        boolean isFilled = str.equalsIgnoreCase("yes") ? true : false;

        Triangle t1 = new Triangle(side1,side2,side3);
        t1.setColor(color);
        t1.setFilled(isFilled);

        return t1;
    }
}
