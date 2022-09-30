package Chapters.chapter_06;

import java.util.Locale;
import java.util.Scanner;

public class C06E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();
        s = s.toUpperCase(Locale.ROOT);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'){
                System.out.print(getNumber(s.charAt(i)));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {

            char ch = uppercaseLetter;
            if (ch == 'A' || ch == 'B' || ch == 'C') {
                return 2;
            } else if (ch == 'D' || ch == 'E' || ch == 'F') {
                return 3;
            } else if (ch == 'G' || ch == 'H' || ch == 'I') {
                return 4;
            } else if (ch == 'J' || ch == 'K' || ch == 'L') {
                return 5;
            } else if (ch == 'M' || ch == 'N' || ch == 'O') {
                return 6;
            } else if ('P' <= ch && ch <= 'S') {
                return 7;
            } else if (ch == 'T' || ch == 'U' || ch == 'V') {
                return 8;
            } else if ('W' <= ch && ch <= 'Z') {
                return 9;
            } else
                return 0;
    }
}