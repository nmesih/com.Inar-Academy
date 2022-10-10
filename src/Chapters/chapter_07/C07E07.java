package Chapters.chapter_07;

public class C07E07 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        countNumbers(arr);
    }
    public static void countNumbers(int[] arr) {
        fillArrWithRandomValues(arr);
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            System.out.printf("The count for %-2d is %-2d \n", i, count);
        }
    }
    public static void fillArrWithRandomValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num =  (int)(Math.random() * 10);
            arr[i] = num;
        }
    }
}
