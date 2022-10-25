package Chapters.chapters_08;

public class C08E27 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        C08E25.initializingArraysWithInputValues(m);
        printingArrays(m);
        System.out.println("\nThe column-sorted array is ");
        printingArrays(sortColumns(m));
    }
    public static double[][] sortColumns(double[][] m){
        for (int col = 0; col < m[0].length; col++) {
            for (int row = 0; row < m.length-1; row++) {
                for (int i = row+1; i < m.length; i++) {
                    if(m[row][col] > m[i][col]) {
                        double temp = m[row][col];
                        m[row][col] = m[i][col];
                        m[i][col] = temp;
                    }
                }
            }
        }
        return m;
    }
    public static void printingArrays(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
    }
}
