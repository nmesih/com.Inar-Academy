package Chapters.chapter_06;

import java.util.Scanner;

public class C06E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = input.nextInt();
        System.out.println("The sum of the digits of entered integer is " + sumDigits(a));
    }

    public static int sumDigits(long n) {
        int digit = 0;
        int result = 0;
        while (n >= 1){
            digit = (int) (n % 10);
            n = n / 10;
            result += digit;
        }
        return result;
    }

}
