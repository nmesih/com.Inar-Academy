package Chapters.chapters_08;

import java.util.Scanner;

public class C08E15 {
    public static void main(String[] args) {
        System.out.println("Enter five points: ");
        double[][] points = new double[5][2];
        initializingArraysWithInputValues(points);
        if(sameLine(points)){
            System.out.println("The five points are on the same line.");
        }else
            System.out.println("The five points are not on the same line.");
    }
    public static void initializingArraysWithInputValues(double[][] points){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[row].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }
    }
    public static boolean sameLine(double[][] points){
        double a = (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
        double b = (points[3][0] - points[2][0]) * (points[4][1] - points[2][1]) - (points[4][0] - points[2][0]) * (points[3][1] - points[2][1]);
        if (a == 0 && b == 0) {
            return true;
        }
        return false;
    }
}
