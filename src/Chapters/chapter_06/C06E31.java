package Chapters.chapter_06;

import java.util.Scanner;

public class C06E31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        if(isValid(number)==true) {
            System.out.println(number + " is valid");
        }else {
            System.out.println(number + " is invalid");
        }
    }
    public static boolean isValid(long number){
       if((getSize(number) >= 13 && getSize(number) <= 16) && sumOfDoubleEvenPlace(number)+sumOfOddPlace(number) % 10 == 0 &&
               (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) ||
                       prefixMatched(number, 6))){
           return true;
       } else
           return false;
    }

    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = num.length()-2; i >= 0; i -= 2){
            sum += getDigit((num.charAt(i)-48)  * 2);
        }
        return sum;
    }
    public static int getDigit(int number){
        if (number <= 9)
            return number;
        else
            return number / 10 + number % 10;
    }
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = num.length()-1; i >= 0; i -= 2){
            sum += (num.charAt(i)-48);
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d){
        String num = d + "";
        return num.length();

    }
    public static long getPrefix(long number, int k){
        int numberOfDigit = getSize(number);
        long result = number / ((long) (Math.pow(10.0, (double) (numberOfDigit - k))));
        return result;
    }

}
