package Chapters.chapter_13.Exercises.E17;

import java.util.Scanner;

public class E_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        Complex first = new Complex(input.nextDouble(), input.nextDouble());

        System.out.println("Enter the second complex number: ");
        Complex second = new Complex(input.nextDouble(), input.nextDouble());

        System.out.println("(" + first + ") + (" + second + ") = " + first.add(second));
        System.out.println("(" + first + ") - (" + second + ") = " + first.subtract(second));
        System.out.println("(" + first + ") * (" + second + ") = " + first.multiply(second));
        System.out.println("(" + first + ") / (" + second + ") = " + first.divide(second));
        System.out.println("|(" + first + ")| = " + first.abs());

    }
}
