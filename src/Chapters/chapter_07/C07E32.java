package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

/*
Enter list: 8 10 1 5 16 61 9 11 1
After the partition, the list is 9 1 5 1 10 61 11 16
 */
public class C07E32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int numberOfTheElementsInTheList = input.nextInt();
        int[] list = new int[numberOfTheElementsInTheList];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        partition(list);
        System.out.println(Arrays.toString(list));
    }
    public static int partition(int[] list){
        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];

        while (high > low) {

            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high >= low && list[high] >= pivot) high--;

        if (high > first) {
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
            return high;
        } else {
            return first;
        }


    }
}
