package Chapters.chapter_06;

import java.util.Scanner;

public class C06E06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("     ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%-5d",j);
            }
            System.out.println();
        }
    }
}
