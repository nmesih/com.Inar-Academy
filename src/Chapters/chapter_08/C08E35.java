package Chapters.chapters_08;

import java.util.Scanner;

public class C08E35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int row = input.nextInt();
        int[][] matrix = new int[row][row];
        System.out.println("Enter the matrix row by row: ");
        initializingArraysWithInputValues(matrix);

        int submatrixRow = findLargestBlock(matrix)[0];
        int submatrixCol = findLargestBlock(matrix)[1];
        int submatrixSize = findLargestBlock(matrix)[2];
        if (submatrixSize > 1) {
            System.out.println("The maximum square submatrix is at (" + submatrixRow + ", " + submatrixCol +
                    ") with size " + submatrixSize);
        } else {
            System.out.println("There is no square matrix");
        }
    }

        public static void initializingArraysWithInputValues ( int[][] matrix){
            Scanner input = new Scanner(System.in);

            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
        }

        public static int[] findLargestBlock ( int[][] m){
            int[] largestBlock = new int[3];
            int size = largestBlock[2];
            for (int row = 0; row < m.length; row++) {
                for (int col = 0; col < m.length; col++) {
                    while (isSquareMatrix(m, row, col, size)) {
                        largestBlock[0] = row;
                        largestBlock[1] = col;
                        largestBlock[2] = size;
                        size++;
                    }
                }
            }
            return largestBlock;
        }

        public static boolean isSquareMatrix ( int[][] matrix, int row, int column, int count){
            if (column + count > matrix.length) {
                return false;
            }

            if (row + count > matrix.length) {
                return false;
            }

            for (int i = row; i < row + count; i++) {
                for (int j = column; j < column + count; j++) {
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
