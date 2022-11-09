package Chapters.chapter_10.Exercises.Exercise_06;

import Chapters.chapter_10.Listings.Listing_07_08_StackOfIntegers.StackOfIntegers;

import java.util.Arrays;

public class Exercise_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 500;

        System.out.println("The first 120 prime numbers are ");

        StackOfIntegers primeFactors = new StackOfIntegers();

        int number = 2;
        while (number < NUMBER_OF_PRIMES) {
            if (isPrime(number)) {
                primeFactors.push(number);
            }
            number++;
        }
        display(primeFactors);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(StackOfIntegers primeFactors) {
        int[]arr = new int[primeFactors.getSize()];
        int index = arr.length-1;
        while (!primeFactors.empty()) {
            arr[index] = primeFactors.pop();
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

