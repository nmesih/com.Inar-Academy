package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list) == true) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }

    }

    public static boolean isSorted(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == selectionSort(list)[i]) {
                count++;
            }
        }
        if (count == list.length) {
            return true;
        } else
            return false;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}