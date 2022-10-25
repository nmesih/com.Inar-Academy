package Chapters.chapters_08;

import java.util.Scanner;

public class C08E25 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        initializingArraysWithInputValues(m);

        if (isMarkovMatrix(m)) {
            System.out.println("It is a Markov matrix.");
        } else {
            System.out.println("It is not a Markov matrix");
        }

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

    public static boolean isMarkovMatrix(double[][] m) {
        double a = columnSum(m)[0];
        double b = columnSum(m)[1];
        double c = columnSum(m)[2];
        if (a == b && b == c){
            return true;
        }else
            return false;
    }

    public static double[] columnSum(double[][] matrix) {
        double[] sum = new double[3];
        for (int column = 0; column < matrix[0].length; column++) {
            double total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            sum[column] = total;
        }
        return sum;
    }
}
