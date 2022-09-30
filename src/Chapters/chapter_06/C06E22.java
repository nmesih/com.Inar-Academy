package Chapters.chapter_06;

import java.util.Scanner;

public class C06E22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        long n = input.nextLong();
        System.out.println("The square root of the " + n + " is " + sqrt(n));

    }

    public static double sqrt(long n) {
        double positive;
        double nextGuess = 1;
        double lastGuess;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) * 0.5;
            if (nextGuess - lastGuess > 0) {
                positive = nextGuess - lastGuess;
            } else {
                positive = lastGuess - nextGuess;
            }
        }
        while (positive > 0.000000000001);

        return lastGuess;
    }
}
