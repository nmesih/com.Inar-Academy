package Chapters.chapter_10.Exercises.Exercise_05;

import Chapters.chapter_10.Listings.Listing_07_08_StackOfIntegers.StackOfIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers primeFactors = new StackOfIntegers();

        int d = 2;
        while (number != 1) {
            if (number % d == 0) {
                primeFactors.push(d);
                number /= d;
            } else {
                d++;
            }
        }
        displayReversed(primeFactors);
    }
        public static void displayReversed (StackOfIntegers primeFactors) {
            int[]arr = new int[primeFactors.getSize()];
            int index = arr.length-1;
            while (!primeFactors.empty()) {
                arr[index] = primeFactors.pop();
                index--;
            }
            System.out.println(Arrays.toString(arr));
    }
}
