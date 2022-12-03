package Chapters.chapter_13.Exercises.E21;

import Chapters.chapter_13.Listings.Rational;

import java.util.Scanner;

public class E_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational h = new Rational(b * -1, 2L * a);

        Rational a1 = new Rational(a,1);
        Rational c1 = new Rational(c,1);

        Rational k =(c1.subtract(a1.multiply(h.multiply(h))));
        System.out.println("h is " + h + " k is " + k);
    }
}
