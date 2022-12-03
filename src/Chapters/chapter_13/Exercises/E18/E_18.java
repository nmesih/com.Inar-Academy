package Chapters.chapter_13.Exercises.E18;

import Chapters.chapter_13.Exercises.E15.Rational2;

import java.math.BigInteger;

public class E_18 {
    public static void main(String[] args) {
        Rational2 r = new Rational2(BigInteger.ONE, new BigInteger("2"));

        for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
             i.compareTo(new BigInteger("99")) <= 0; i = i.add(BigInteger.ONE)) {
             r = r.add(new Rational2(i, i.add(BigInteger.ONE)));
        }

        System.out.println(r);
    }
}
