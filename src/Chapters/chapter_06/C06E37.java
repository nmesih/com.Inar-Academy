package Chapters.chapter_06;

import java.util.Scanner;

public class C06E37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        System.out.println("Enter width :");
        int width = input.nextInt();
        System.out.println("The format is " + format(number,width));
    }
    public static String format(int number, int width){
        String format = "";
        format += number;
        String other = "";
        int a = format.length();
        if (a > width){
            return format;
        }
        while (a != width) {
            other += "0";
            a++;
        }
        return other + format;
    }

}
