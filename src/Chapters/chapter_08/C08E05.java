package Chapters.chapters_08;

import java.util.Scanner;

public class C08E05 {
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
        printingArrays(addMatrix(a,b));
    }

     public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] addMatrix = new double[3][3];
         for (int i = 0; i < addMatrix.length; i++) {
             for (int j = 0; j < addMatrix[i].length; j++) {
                 addMatrix[i][j] = a[i][j] + b[i][j];
             }
         }
         return addMatrix;
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
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
    }
}
