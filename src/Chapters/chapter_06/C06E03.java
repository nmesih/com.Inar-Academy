package Chapters.chapter_06;

import java.util.Enumeration;
import java.util.Scanner;

public class C06E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = input.nextInt();
        if (isPalindrome(a)) {
            System.out.println("The number you entered is the palindrome");
        } else {
            System.out.println("The number you entered is not the palindrome");
        }
    }

    public static int reverse(int number) { // An integer is reversed.
        int digit = 0;
        int reverseNumber = 0;
        while (number >= 1) {
            digit = (int) (number % 10);
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int number) { // Reserve number is compared with entered integer.
        int b = reverse(number);
        if (b == number) {
            return true;
        }
        return false;
    }
}
