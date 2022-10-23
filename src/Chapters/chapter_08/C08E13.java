package Chapters.chapters_08;

import java.util.Scanner;

public class C08E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] a = new double[row][col];
        initializingArraysWithInputValues(a);
        System.out.print("The location of the largest element is at (" + locateLargest(a)[0] +
                " , " + locateLargest(a)[1] + ")");

    }
    public static void initializingArraysWithInputValues(double[][] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array: ");
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = input.nextDouble();
            }
        }
    }
    public static int[] locateLargest(double[][] a){
        int[] array = new int[2];
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(max < a[i][j]){
                    max = a[i][j];
                    array[0] = i;
                    array[1] = j;
            }
        }
    }
        return array;
}
}
