package Chapters.chapters_08;

import java.util.Scanner;

public class C08E28 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        System.out.println("Enter list1: ");
        initializingArraysWithInputValues(m1);
        int[][] m2 = new int[3][3];
        System.out.println("Enter list2: ");
        initializingArraysWithInputValues(m2);
        if(equals(m1, m2)){
            System.out.println("The two arrays are strictly identical");
        }else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if ((m1.length != m2.length)) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initializingArraysWithInputValues(int[][] matrix) {
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
}
