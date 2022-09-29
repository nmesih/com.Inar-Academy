package Chapters.chapter_06;

import java.util.Scanner;

public class C06E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        for (int i = 0; i < n ; i++) {
            printMatrix(n);
            System.out.println();
        }
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(Math.round(Math.random()) + "  ");
        }
    }
}
