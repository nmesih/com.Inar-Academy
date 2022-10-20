package Chapters.chapters_08;

import java.util.Scanner;

public class C08E06 {
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        initializingArraysWithInputValues(a);
        double[][] b = new double[3][3];
        initializingArraysWithInputValues(b);
        System.out.println("The matrices are added as follows");
        printingArrays(a);
        System.out.println("      + ");
        printingArrays(b);
        System.out.println("      = ");
        printingArrays(multiplyMatrix(a,b));

    }
    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
    public static void initializingArraysWithInputValues(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
    }
    public static void printingArrays(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf(" %2.1f ", matrix[row][column]);
            }
            System.out.println();
        }
    }
}
