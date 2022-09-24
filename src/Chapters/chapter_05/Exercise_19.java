package Chapters.chapter_05;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print("     ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%5d", (int) Math.pow(2, k));
            }
            for (int k = i - 2; k >= 0; k--) {
                System.out.printf("%5d", (int) Math.pow(2, k));
            }
            System.out.println();
        }

    }
}
