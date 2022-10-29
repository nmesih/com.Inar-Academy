package Chapters.chapter_08;

import java.util.Scanner;

import static java.util.Arrays.fill;

public class C08E09 {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        fill(table, ' ');
        boolean XTurn = true;
        boolean isDraw = true;

        while (!isFull(table)) {
            displayTable(table);
            promptTheUser(table, XTurn);
            if (checkWins(table)) {
                displayTable(table);
                System.out.println((XTurn ? "X" : "Y") + " player won");
                isDraw = false;
                break;
            }
            XTurn = !XTurn;
        }

        if (isDraw) {
            System.out.println("Game over! It's DRAW.");
        }
    }

    public static boolean checkWins(char[][] table) {
        return checkRows(table) || checkCols(table) || checkMajorDiagonal(table) || checkSubDiagonal(table);
    }

    public static boolean checkSubDiagonal(char[][] table) {
        for (int r = 0, c = table.length - 1; r < table.length - 1; r++, c--) {
            if (table[r][c] == ' ' || (table[r][c] != table[r + 1][c - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkMajorDiagonal(char[][] table) {

        for (int rAndC = 0; rAndC < table.length - 1; rAndC++) {
            if (table[rAndC][rAndC] == ' ' || (table[rAndC][rAndC] != table[rAndC + 1][rAndC + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCols(char[][] table) {
        boolean isOver;

        for (int col = 0; col < table.length; col++) {
            isOver = true;


            for (int row = 0; row < table.length - 1; row++) {
                if (table[0][col] == ' ' || table[row][col] != table[row + 1][col]) {

                    isOver = false;
                }
            }

            if (isOver) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkRows(char[][] table) {
        boolean isOver;

        for (int row = 0; row < table.length; row++) {
            isOver = true;

            for (int col = 0; col < table[row].length - 1; col++) {
                if (table[row][0] == ' ' || table[row][col] != table[row][col + 1]) {
                    isOver = false;
                }
            }

            if (isOver)
                return true;
        }

        return false;
    }

    public static void promptTheUser(char[][] table, boolean xTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a row (0, 1, 2) for player ");
            System.out.print(xTurn ? "X: " : "Y: ");
            int r = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");
            System.out.print(xTurn ? "X: " : "Y: ");
            int c = input.nextInt();

            if (c < 0 || c > 2 || r < 0 || r > 2) {
                System.out.println("Please choose another place!");
                continue;
            }

            if (table[r][c] == ' ') {
                table[r][c] = xTurn ? 'X' : 'Y';
                break;
            }

            System.out.println("Please choose another place!");

        }
    }

    public static void displayTable(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            System.out.println("-------------");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("| " + table[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public static boolean isFull(char[][] table) {
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                if (table[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void fill(char[][] table, char ch) {
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = ch;
            }
        }
    }
}

