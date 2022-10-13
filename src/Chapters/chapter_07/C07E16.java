package Chapters.chapter_07;

import static Chapters.chapter_07.Listing_08_SelectionSort.selectionSort;

public class C07E16 {
    public static void main(String[] args) {
        int key = 1 + (int) (Math.random() * 100000);
        int[] list = new int[100000];
        fillArrWithRandomValues(list, 1 , 100000);
        long startTime = System.currentTimeMillis();
        System.out.println("The key is " + key + " and it is now at " + linearSearch(list,key));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Start time is: " + startTime + "\nEnd time is: " + endTime );
        System.out.println("The execution time is for linear search " + executionTime + " milliseconds");


        startTime = System.currentTimeMillis();
        selectionSort(list);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("The execution time for selection sort is " + executionTime + " milliseconds");


        startTime = System.currentTimeMillis();

        System.out.println("The key is " + key + " and it is at " + binarySearch(list, key));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The execution time for binary search is " + executionTime + " milliseconds");
    }

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public static void fillArrWithRandomValues(int[] arr, int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            int num = start + (int) (Math.random() * (limit - start));
            arr[i] = num;
        }
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}
