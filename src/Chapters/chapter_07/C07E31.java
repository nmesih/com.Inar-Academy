package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E31 {
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

        System.out.println("The merged list is " + Arrays.toString(merge(list1, list2)));

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merge = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {       //list1' in elemanlarini merge'in içine yaziyorum.
            merge[i] = list1[i];
        }
        for (int i = list1.length, j = 0; i < merge.length; i++, j++) { //list1'in bitiminden baslayip list2'nin elemanlarini merge'nin icine yaziyorum.
            merge[i] = list2[j];
        }
        for (int i = 0; i < merge.length - 1; i++) { //olusturdugum merge array'ini siraliyorum
            for (int j = i + 1; j < merge.length; j++) {
                if (merge[i] > merge[j]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        return merge;
    }
}
