package Chapters.chapter_06;

import java.util.Scanner;

public class C06E23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and char: ");
        String str = input.nextLine();
        String s = input.next();
        char a = s.charAt(0);
        System.out.println("the number of occurrences of the character in the string is " + count(str, a));
    }

    public static int count(String str, char a) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == a) {
                count++;
            }

        }

        return count;
    }

}
