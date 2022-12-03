package Chapters.chapter_13.Exercises.E19;

import Chapters.chapter_13.Exercises.E15.Rational2;

import java.math.BigInteger;

import java.util.Scanner;

public class E_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        String[] s = input.nextLine().split("[.]");
        Rational2 a = new Rational2(new BigInteger(s[0]), BigInteger.ONE);

        Rational2 b = new Rational2(new BigInteger(s[1]),new BigInteger(String.valueOf((int)(Math.pow(10,s[1].length())))));

        System.out.println("The fraction number is " + (s[0].charAt(0) == '-' ? (a).subtract(b) : (a).add(b)));
    }



    }

