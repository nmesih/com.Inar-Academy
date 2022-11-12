package Chapters.chapter_10.Exercises.Exercise_17;

import java.math.BigInteger;
import java.util.Arrays;

public class Exercise_17 {
    public static void main(String[] args) {
        BigInteger startNumber = BigInteger.valueOf((long) Math.sqrt(Long.MAX_VALUE));

        System.out.println("The square numbers greater than Long.MAX_VALUE : ");
        for (int i = 0; i < 10; i++) {
            startNumber = startNumber.add(BigInteger.ONE);
            BigInteger bigInteger = startNumber.pow(2);
            System.out.println(bigInteger);
        }
    }
}
