package Chapters.chapter_06;

import java.util.Scanner;

public class Listing_01_TestMax {
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Max is " + max(a, b));
    }
    public static int max(int a, int b) {
        int max = a < b ? b : a;
        return max;
    }
}
