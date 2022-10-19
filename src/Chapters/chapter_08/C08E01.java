package Chapters.chapters_08;

import java.util.Scanner;

public class C08E01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] m = new double[3][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m,i));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][columnIndex];
            }
            return sum;
    }
}
