package Chapters.Java_Set_Map_Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayList_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        printArray(matrix);

        rowSorting(matrix);
        System.out.println("-----------");
        printArray(matrix);

    }

    private static void rowSorting(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    private static void printArray(double[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
