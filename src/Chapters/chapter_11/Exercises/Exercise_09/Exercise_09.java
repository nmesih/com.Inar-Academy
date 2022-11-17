package Chapters.chapter_11.Exercises.Exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int n = input.nextInt();

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int[][] matrix = createdArray(n);
        rowsSum(rows,matrix);
        colsSum(cols,matrix);
        displayArray(matrix);
        maxRow(rows);
        maxCol(cols);

    }


    private static int[][] createdArray(int n) {

        int[][] matrix = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    private static void rowsSum(ArrayList<Integer> rows, int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            int sum = 0;
            for (int c = 0; c < matrix.length; c++) {
                sum += matrix[r][c];
            }
            rows.add(sum);
        }
    }

    private static void colsSum(ArrayList<Integer> cols, int[][] matrix) {
        for (int c = 0; c < matrix.length; c++) {
            int sum = 0;
            for (int r = 0; r < matrix.length; r++) {
                sum += matrix[r][c];
            }
            cols.add(sum);
        }
    }

    private static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void maxRow(ArrayList<Integer> rows) {
        Integer max = rows.get(0);
        for (int i = 1; i < rows.size(); i++) {
            if(max.compareTo(rows.get(i)) == -1){
                max = rows.get(i);
            }
        } //We found the max value. Now just in case the max is more than one
          //We define the indexes of the max to an arraylist and then print these indexes.

        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
            if(rows.get(i).compareTo(max) == 0){
                list.add(i);
            }
        }
        System.out.println("Max row index " + list);
    }

    private static void maxCol(ArrayList<Integer> cols) {
        Integer max = cols.get(0);
        for (int i = 1; i < cols.size(); i++) {
            if(max.compareTo(cols.get(i)) == -1){
                max = cols.get(i);
            }
        }//We found the max value. Now just in case the max is more than one
        //We define the indexes of the max to an arraylist and then print these indexes.

        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < cols.size(); i++) {
            if(cols.get(i).compareTo(max) == 0){
                list.add(i);
            }
        }

        System.out.println("Max column index " + list);

    }
}
