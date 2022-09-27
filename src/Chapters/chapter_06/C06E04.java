package Chapters.chapter_06;

import java.util.Scanner;

public class C06E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = input.nextInt();
        reverse(a);

    }
    public static void reverse(int number) { // An integer is reversed.
        int digit = 0;
        int reverseNumber = 0;
        while (number >= 1) {
            digit = (int) (number % 10);
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse of the entered number is " + reverseNumber);
    }
}
