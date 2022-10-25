package Chapters.chapters_08;

public class C08E26 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        C08E25.initializingArraysWithInputValues(m);
        printingArrays(m);
        System.out.println("------------");
        printingArrays(sortRows(m));


    }

    public static double[][] sortRows(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length - 1; col++) {
                for (int j = col + 1; j < m[row].length; j++) {
                    if (m[row][col] > m[row][j]) {
                        double temp = m[row][col];
                        m[row][col] = m[row][j];
                        m[row][j] = temp;
                    }
                }
            }
        }
        return m;
    }

    public static void printingArrays(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

}
