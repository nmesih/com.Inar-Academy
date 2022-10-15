package Chapters.chapters_08;

import java.util.Scanner;

public class TwoDimensionalArray {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[2][5];
        printArr(arr);
        System.out.println("--------");
        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);
        System.out.println("arr[1].length = " + arr[1].length);

        int[][] bArr = new int[2][];
        bArr[0] = new int[3];
        bArr[1] = new int[7];
        printArr(bArr);

    }

    public static void printArr(int[][] arr) {
        System.out.println("-----------------");
        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.printf(" [%3d] ", arr[satir][sutun]);
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }


    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * (limit - start) + start);
            }
        }
    }

    public static int[][] getEmpty2DArrayFromUser(){
        System.out.println("Please enter the row and colum lengths of the matrix you want to create");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        return arr;
    }


}

