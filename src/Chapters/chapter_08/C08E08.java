package Chapters.chapters_08;

import java.util.Scanner;

public class C08E08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int row = input.nextInt();
        System.out.println("Enter " + row + " points: ");
        int[][] matrix = new int[row][2];
        for (row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = Double.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double distance = distance(matrix[i][0], matrix[i][1], matrix[j][0], matrix[j][1]); // Find distance

                if (shortestDistance > distance) {
                    shortestDistance = distance; //
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                if(distance(matrix[i][0], matrix[i][1], matrix[j][0], matrix[j][1]) == shortestDistance){
                    System.out.println("The closest two points are " + "(" + matrix[i][0] + ", " + matrix[i][1] +
                            ") and (" + matrix[j][0] + ", " + matrix[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }
    public static double distance (double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    }

