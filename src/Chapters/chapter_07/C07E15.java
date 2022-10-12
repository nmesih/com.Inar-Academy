package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class C07E15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int[] eliminateDuplicate = eliminateDuplicates(list);

        for (int i = 0; i < eliminateDuplicate[eliminateDuplicate.length - 1]; i++) {
            System.out.print(eliminateDuplicate[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminateDublicate = new int[list.length + 1];
        int count = 1;
        eliminateDublicate[0] = list[0];
        boolean isDublicate;
        for (int i = 1; i < list.length; i++) {
            isDublicate = false;

            for (int j = 0; j < count; j++) {

                if (eliminateDublicate[j] == list[i]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                eliminateDublicate[count] = list[i];
                count++;
            }
        }
        eliminateDublicate[eliminateDublicate.length - 1] = count;
        return eliminateDublicate;
    }
}

