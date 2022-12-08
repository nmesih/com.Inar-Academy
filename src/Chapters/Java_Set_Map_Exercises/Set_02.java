package Chapters.Java_Set_Map_Exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_02 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        Set<Integer> primeNumbers = new HashSet<>();

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            if (isPrime) {
                primeNumbers.add(number);
                count++;
            }
            number++;
        }
        System.out.println(Arrays.toString(primeNumbers.toArray()));
    }
}
