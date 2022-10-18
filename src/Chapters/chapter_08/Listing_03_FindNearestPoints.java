package Chapters.chapters_08;

import java.util.Scanner;

public class Listing_03_FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = Double.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance

            if (shortestDistance > distance) {
                shortestDistance = distance; //
                p1 = i; // Update p1
                p2 = j; // Update p2
            }
        }
    }
        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] +
                ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
        }
        public static double distance (double x1, double y1, double x2, double y2) {
            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

}