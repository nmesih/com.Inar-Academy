package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.println("Enter ten values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(double[] list) {
        for (int i = list.length-1; i >= 1; i--) {
            for (int j = 0; j < i ; j++) {
                if (list[i] < list[j]) {
                    double temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
}
