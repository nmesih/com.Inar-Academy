package Chapters.chapter_06;

import java.util.Scanner;

public class IsPresentInNewString {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String a = input.nextLine();
            String result = "";
            result = newString(s,a,result);
            System.out.println(result);
        }
    public static String newString(String s, String a, String result) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                String c = "";
                if (s.charAt(i) != a.charAt(j)){
                    c += s.charAt(i);
                    result = c;
                }
            }
        }

        return result;
    }
}


