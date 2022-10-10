package Chapters.chapter_07;

import java.util.Scanner;

public class C07E03 {
    public static void main(String[] args) {
        System.out.println("Enter the integers between 1 and 100:");
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        int number = 0;
        int count = 0;
        while (true) {
            int num = input.nextInt();
            arr[count] = num;
            count++;
            if(num == 0){
                break;
            }
        }
        countNumber(arr);
    }
    public static void countNumber(int[] arr){

        for (int i = 1; i < 100; i++) {
            int count = 0;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] == i){
                    count++;
                }
            }
            if (count != 0) {
                if(count == 1){
                    System.out.printf("%-2d occurs %-2d time \n", i, count);
                } else
                    System.out.printf("%-2d occurs %-2d times \n", i, count);
            }
        }
    }

    }

