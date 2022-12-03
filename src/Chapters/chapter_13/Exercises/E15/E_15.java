package Chapters.chapter_13.Exercises.E15;

import java.math.BigInteger;

public class E_15 {
    public static void main(String[] args) {
        Rational2 first = new Rational2(new BigInteger("100000000000"), new BigInteger("1000000000000"));
        Rational2 second = new Rational2(new BigInteger("1000000000000"), new BigInteger("500000000000"));

        System.out.println("First Big Integer * second Big Integer = " + first.multiply(second));
        System.out.println("First Big Integer / second Big Integer = " + first.divide(second));
    }
}
