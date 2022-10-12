package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[]array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The reserved form of the numbers " + Arrays.toString(reverseNumber(array)));

    }
    public static int[] reverseNumber(int[] array){
        int[] reversedNumber = new int[array.length];
        for (int i = 0, j = reversedNumber.length - 1; i < array.length; i++, j--) {
            reversedNumber[j] = array[i];
        }
        return reversedNumber;
    }
}
