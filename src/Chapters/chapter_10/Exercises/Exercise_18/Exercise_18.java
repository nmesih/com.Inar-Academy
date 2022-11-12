package Chapters.chapter_10.Exercises.Exercise_18;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        //(Large prime numbers) Write a program that finds five prime numbers larger
        //than Long.MAX_VALUE
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        number = number.add(BigInteger.ONE);
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isPrime(BigInteger number) {

        BigInteger divisor = new BigInteger("2");

        while (divisor.compareTo(number.divide(new BigInteger(2 + ""))) <= 0) {
            if (number.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}

