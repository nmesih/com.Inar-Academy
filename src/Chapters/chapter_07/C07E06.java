package Chapters.chapter_07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C07E06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        int[] primeNumbers = new int[50];
        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            if (isPrime) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        System.out.println(Arrays.toString(primeNumbers));
    }
}