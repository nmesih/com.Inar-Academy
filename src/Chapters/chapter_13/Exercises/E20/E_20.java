package Chapters.chapter_13.Exercises.E20;

import Chapters.chapter_13.Exercises.E17.Complex;

import java.util.Scanner;

public class E_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        double r1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
        double r2 = (-b - (Math.sqrt(discriminant))) / (2 * a);

        if (discriminant > 0){
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + r1 );
        } else {
            System.out.print("The roots are ");
            Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println(root1 + " and " + root2);
        }
    }
}
