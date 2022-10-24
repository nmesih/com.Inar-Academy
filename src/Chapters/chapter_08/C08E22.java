package Chapters.chapters_08;

public class C08E22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        fill2DArrWithRandomValues(matrix);
        Processing_Two_Dimensional_Arrays.printingArrays(matrix);
        System.out.println();
        checkRows(matrix);
        System.out.println("-----------");
        checkColumns(matrix);

    }

    public static void fill2DArrWithRandomValues(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
    }

    public static void checkRows(int[][] matrix) {
        int count;

        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0 && count != 0) {
                System.out.println("Row " + row + " have even number of 1s ");
            } else
                System.out.println("Row " + row + " have not even number of 1s ");
        }
    }
    public static void checkColumns(int[][] matrix){
        int count;

        for (int col = 0; col < matrix[0].length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0 && count != 0) {
                System.out.println("Column " + col + " have even number of 1s ");
            } else
                System.out.println("Column " + col + " have not even number of 1s ");
        }
    }
}

