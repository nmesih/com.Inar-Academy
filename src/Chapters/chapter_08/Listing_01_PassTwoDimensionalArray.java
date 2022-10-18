package Chapters.chapters_08;
import java.util.Scanner;

public class Listing_01_PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("\nSum of all elements is " + sum(m));
    }
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][4];
        System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    public static int sum(int[][] m){
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }
}