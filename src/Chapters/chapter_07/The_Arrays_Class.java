package Chapters.chapter_07;

public class The_Arrays_Class {
    public static void main(String[] args) {
        System.out.println("Sort");
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers); // Sort the whole array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nParallel Sort");
        java.util.Arrays.parallelSort(numbers); // Sort the whole array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 3); // Sort part of the array
        java.util.Arrays.parallelSort(chars, 1, 3); // Sort part of the array

        binarySearch();
        equals();

    }
    public static void binarySearch(){
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list, 12));

        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars, 't'));
    }

    public static void equals(){
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3)); // false
    }
}
