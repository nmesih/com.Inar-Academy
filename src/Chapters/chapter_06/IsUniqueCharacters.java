package Chapters.chapter_06;

import java.util.Locale;
import java.util.Scanner;

public class IsUniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Is " + s + " unique?");
        if(isUnique(s)){
            System.out.println(s + " is a unique string");
        } else {
            System.out.println(s + " is not a unique string");
        }
    }

    public static boolean isUnique(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
    return true;
    }
}



