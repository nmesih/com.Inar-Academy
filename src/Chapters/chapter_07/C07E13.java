package Chapters.chapter_07;

import java.util.Scanner;

public class C07E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("List of 20 random numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.println(getRandom(numbers));

        }
    }
    public static int getRandom(int... numbers) {
        int getRandom = 0;
        boolean isEqual = true;
        while (true) {
            getRandom = intRandom(1, 54);
            isEqual = false;

            for (int i : numbers) {
                if (getRandom == i) {
                    isEqual = true;
                    break;
                }
            }
        return getRandom;
        }
    }

    public static int intRandom(int start, int limit) {
        int num = start + (int) (Math.random() * (limit - start));
        return num;

    }
}

