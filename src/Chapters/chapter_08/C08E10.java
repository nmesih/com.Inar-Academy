package Chapters.chapters_08;

public class C08E10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        randomlyMatrix(matrix);
        printingArrays(matrix);
        System.out.println("\nThe largest row index " + largestRowIndex(matrix));
        System.out.println("The largest column index " + largestColumnIndex(matrix));

    }

    public static int largestColumnIndex(int[][] matrix) {
        int i = -1;
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < matrix.length; col++) {
            int sumOfCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumOfCol += matrix[row][col];
            }
            if (sumOfCol >= max) {
                i = col;
                max = sumOfCol;
            }
        }
        return i;
    }

    public static int largestRowIndex(int[][] matrix) {
        int i = -1;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            int sumOfRow = 0;
            for (int col = 0; col < matrix.length; col++) {
                sumOfRow += matrix[row][col];
            }
            if (sumOfRow >= max) {
                i = row;
                max = sumOfRow;
            }
        }
        return i;
    }

    public static int[][] randomlyMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printingArrays(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
    }
}