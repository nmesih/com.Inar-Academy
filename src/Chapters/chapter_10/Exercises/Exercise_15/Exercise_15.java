package Chapters.chapter_10.Exercises.Exercise_15;

import Chapters.chapter_10.Exercises.Exercise_13.MyRectangle2D;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {

        double[][] points = getPointsFromUser();
        MyRectangle2D r = getRectangle(points);

        System.out.println("The bounding rectangle's\ncenter: (" + r.getX() +
                ", " + r.getY() + ")\nwidth : " + r.getWidth() + "\nheight: " +
                r.getHeight());
    }

    private static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double minY = points[0][1];
        double maxX = points[0][0];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
            if (points[i][1] < minY) {
                minY = points[i][1];
            }
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }
        }
            double width = maxX - minX;
            double height = maxY - minY;
            double x = maxX - (width/2);
            double y = maxY - (height/2);

        return new MyRectangle2D(x, y, width, height);
    }

    private static double[][] getPointsFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[5][2];
        System.out.println("Enter points: ");
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

}
