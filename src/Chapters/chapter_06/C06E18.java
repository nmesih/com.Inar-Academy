package Chapters.chapter_06;

import java.util.Scanner;

public class C06E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = input.next();
        int i = password.length();
        if (isValid(password, i) == true) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }


    public static boolean isValid(String password, int i) {
        int digit = 0;
        for (i = 0; i < password.length(); i++) {
            if (password.length() < 8) {
                return false;
            }
            if (password.charAt(i) < '0' || (password.charAt(i) > '9' && password.charAt(i) < 'A') ||
                    (password.charAt(i) > 'Z' && password.charAt(i) < 'a') || password.charAt(i) > 'z') {
                return false;
            }
            if ((password.charAt(i) <= '9' && password.charAt(i) >= '0')) {
                digit++;
            }
        }
        if (digit < 2) {
            return false;
        }
        return true;
    }
}
