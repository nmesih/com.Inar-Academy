package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j - 1] > list[j]) {
                    double temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
