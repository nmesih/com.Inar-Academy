package Chapters.chapter_09.Exercises.Exercise_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] a = new double[row][column];
        System.out.println("Enter the array:");
        initializingArraysWithInputValues(a);

        Location locate = locateLargest(a);
        System.out.println(locate.toString());
    }

    public static Location locateLargest(double[][] a) {
        int row = -1;
        int col = -1;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new Location(row, col, max);
}

    public static void initializingArraysWithInputValues(double[][] matrix) {
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
    }
}
