package Chapters.chapter_06;

import java.util.Scanner;

public class IsPresentInNewString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String :");
        String s1 = input.nextLine();
        System.out.println("Enter second String :");
        String s2 = input.nextLine();

        s1 = removeCharacters(s1, s2);
        System.out.println("S1 after removing = " + s1);
    }

    public static String removeCharacters(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            s1 = removeOneCharacter(s1, s2.charAt(i));
        }
        return s1;
    }

    public static String removeOneCharacter(String s1, char ch) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            //
            if (s1.charAt(i) != ch) {
                result += s1.charAt(i);
            }
        }
        return result;
    }
}




