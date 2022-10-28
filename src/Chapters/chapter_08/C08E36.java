package Chapters.chapters_08;

import java.util.Scanner;

public class C08E36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number n: ");
        int n = input.nextInt();
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char[][] matrix = new char[n][n];
        int max = 65 + matrix.length - 1;
        initializingArraysWithInputValues(matrix, max);
        if (isLatinSquare(matrix)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }

    }

    private static boolean isLatinSquare(char[][] matrix) {

        if (!checkRow(matrix)) {
            return false;
        }
        if (!checkColumn(matrix)) {
            return false;
        }

        return true;
    }

    private static boolean checkRow(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean[] row = new boolean[matrix.length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[matrix[i][j] - 'A']) {
                    return false;
                } else {
                    row[matrix[i][j] - 'A'] = true;
                }
            }
        }
        return true;
    }

    private static boolean checkColumn(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean[] col = new boolean[matrix.length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (col[matrix[j][i] - 'A']) {
                    return false;
                } else {
                    col[matrix[j][i] - 'A'] = true;
                }
            }
        }
        return true;
    }


    public static void initializingArraysWithInputValues(char[][] matrix, int max) {
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.next().charAt(0);
                if (matrix[row][column] > max) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) max);
                    System.exit(1);
                }
            }
        }
    }

}
