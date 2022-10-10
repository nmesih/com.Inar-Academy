package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers:");
        Scanner input = new Scanner(System.in);
        int num;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            if(isIgnored(numbers, num , i)){
                numbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean isIgnored(int[] numbers, int num, int j) {
        for (int i = 0; i < j; i++) {
            if (numbers[i] == num)
                return false;
        }
        return true;
    }
}

