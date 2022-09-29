package Chapters.chapter_06;

import java.util.Scanner;

public class C06E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.next();
        System.out.println("The number of letters in the string is " + countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
                count++;
            }
            if ((s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')) {
                count++;
            }
        }
        return count;
    }
}
