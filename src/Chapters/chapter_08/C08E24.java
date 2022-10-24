package Chapters.chapters_08;

import java.util.Scanner;

public class C08E24 {
    public static void main(String[] args) {
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }
    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }
    private static boolean isValid(int[][] sudoku) {
        if (numberCheck(sudoku)==false) {
            return false;
        }
        if (rowCheck(sudoku) == false) {
            return false;
        }
        if (columnCheck(sudoku) == false) {
            return false;
        }
        if(smallBoxCheck(sudoku) == false){
            return false;
        }
        return true;
    }

    private static boolean smallBoxCheck(int[][] sudoku) {
        for (int boxNumber = 0; boxNumber < 9; boxNumber++) {
            boolean[] uniqueSmallBox = new boolean[9];
            for (int i = (boxNumber / 3) * 3; i < (boxNumber / 3) * 3 + 3; i++){
                for (int j =(boxNumber % 3) * 3; j < (boxNumber % 3) * 3 + 3; j++){
                    if (uniqueSmallBox[sudoku[i][j] - 1]) {
                        return false;
                    } else {
                        uniqueSmallBox[sudoku[i][j] - 1] = true;
                    }
                }
            }
        }
        return true;
    }

    private static boolean columnCheck(int[][] sudoku) {
        for (int col = 0; col < sudoku[0].length; col++) {
            boolean[] check = new boolean[9];
            for (int row = 0; row < sudoku.length; row++) {
                check[sudoku[row][col] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean rowCheck(int[][] sudoku) {
        for (int row = 0; row < sudoku.length; row++) {
            boolean[] check = new boolean[9];
            for (int col = 0; col < sudoku[row].length; col++) {
                check[sudoku[row][col] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean numberCheck(int[][] sudoku) {
        for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku[row].length; col++) {
                if (sudoku[row][col] < 1 || sudoku[row][col] > 9) {
                    return false;
                }
            }
        }
        return true;
    }
}

