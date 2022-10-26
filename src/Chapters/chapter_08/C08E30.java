package Chapters.chapters_08;

import java.util.Scanner;

public class C08E30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[2][2];
        System.out.println("Enter a₀₀, a₀₁, a₁₀, a₁₁, b₀, b₁");
        initializingArraysWithInputValues(a);

        double[] b = new double[2];
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();

        double[] linear = linearEquation(a,b);
        if(linear == null){
            System.out.println("The equation has no solution.");
        }else
            System.out.println("x is " + linear[0] + " and y is " + linear[1]);
      }
    public static double[] linearEquation(double[][] a, double[] b){
        double[] arr = new double[2];
        if((a[0][0] * a[1][1]) - (a[0][1]* a[1][0]) == 0){
            return null;
        }
        arr[0] = (((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - ((a[0][1]* a[1][0]))));
        arr[1] = (((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - ((a[0][1]* a[1][0]))));
        return arr;
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
