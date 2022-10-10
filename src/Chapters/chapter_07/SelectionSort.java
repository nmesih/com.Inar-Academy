package Chapters.chapter_07;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 7, 9, 3, 5, 12, 6, 2, 5
        // 2
        //En küçüğü bul.
        int[] arr = new int[10];
        BinarySearch.fillArrWithRandomValues(arr, 0, 20);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        selectionSort(arr);
        System.out.println("INAR :" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("JAVA :" + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    }

