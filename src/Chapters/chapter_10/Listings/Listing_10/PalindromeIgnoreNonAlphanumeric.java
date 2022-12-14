package Chapters.chapter_10.Listings.Listing_10;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
         System.out.print("Enter a string: ");
         String s = input.nextLine();

         // Display result
         System.out.println("Ignoring nonalphanumeric characters, is "
                 + s + " a palindrome? \n" + isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String s1 = filter(s);

         // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
         return s2.equals(s1);
        }

    public static String filter(String s){
        StringBuilder stringBuilder = new StringBuilder();

         for (int i = 0; i < s.length(); i++) {
             if (Character.isLetterOrDigit(s.charAt(i))) {
                 stringBuilder.append(s.charAt(i));
             }
         }
        return stringBuilder.toString();
    }
    public static String reverse(String s) {
         StringBuilder stringBuilder = new StringBuilder(s);
         stringBuilder.reverse(); // Invoke reverse in StringBuilder
         return stringBuilder.toString();
         }
    }

