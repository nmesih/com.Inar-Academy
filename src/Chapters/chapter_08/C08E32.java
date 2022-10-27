package Chapters.chapters_08;

import java.util.Scanner;

public class C08E32 {
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        initializingArraysWithInputValues(points);
        double areaOfTheTriangle = getTriangleArea(points);
        if(areaOfTheTriangle == 0){
            System.out.println("The three points are on the same line");
        } else{
            System.out.printf("The area of the triangle is %.2f", areaOfTheTriangle);
        }
    }
    public static double getTriangleArea(double[][] points){

        if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0) {
            return 0;
        }

        double side1 = Math.pow( Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2) ,0.5);
        double side2 = Math.pow( Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2) ,0.5);
        double side3 = Math.pow( Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2) ,0.5);
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;

    }
    public static void initializingArraysWithInputValues(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
    }
}
