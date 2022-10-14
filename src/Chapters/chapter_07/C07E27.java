package Chapters.chapter_07;

import java.util.Scanner;

public class C07E27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int numberOfTheElementsInTheList = input.nextInt();
        int[] list1 = new int[numberOfTheElementsInTheList];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int numberOfTheElementsInTheList2 = input.nextInt();
        int[] list2 = new int[numberOfTheElementsInTheList2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        sort(list1);
        sort(list2);

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical.");
        } else {
            System.out.println("Two lists are not identical.");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
