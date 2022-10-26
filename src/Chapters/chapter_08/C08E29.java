package Chapters.chapters_08;

import java.util.Scanner;

public class C08E29 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        System.out.println("Enter list1: ");
        initializingArraysWithInputValues(m1);
        int[][] m2 = new int[3][3];
        System.out.println("Enter list2: ");
        initializingArraysWithInputValues(m2);
        if(equals(m1, m2)){
            System.out.println("The two arrays are identical");
        }else {
            System.out.println("The two arrays are not identical");
        }
    }
    public static void initializingArraysWithInputValues(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
    public static int[] sort(int[][] m) {
        int[] arr = new int[9];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                 arr[k] = m[i][j];
                 k++;
            }
        }
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static boolean equals(int[][] m1, int[][] m2){
        if (m1.length != m2.length) {
            return false;
        }
        int[] matrix1 = sort(m1);
        int[] matrix2 = sort(m2);
        for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i] != matrix2[i]) {
                    return false;
                }
            }
        return true;
    }
}
