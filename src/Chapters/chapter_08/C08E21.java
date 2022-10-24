package Chapters.chapters_08;

import java.util.Scanner;

public class C08E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int cities = input.nextInt();
        System.out.println("Enter the coordinates of the cities: ");
        double[][] matrix = new double[cities][2];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = input.nextDouble();
            matrix[i][1] = input.nextDouble();
        }
        double distance = totalDistance(matrix)[0];
        int location = (int)(totalDistance(matrix)[1]);
        System.out.print("The central city is at ");
        centralCityLocation(matrix, location);
        System.out.printf("The total distance to all other cities is %2.2f" , distance);
    }

    private static void centralCityLocation(double[][] matrix, int a) {
        double x = matrix[a][0];
        double y = matrix[a][1];
        System.out.println("(" + x + ", " + y + ")");
    }

    private static double[] totalDistance(double[][] matrix) {
        double distance;
        double min = Double.MAX_VALUE;
        double[] a = new double[2];
        for (int i = 0; i < matrix.length; i++) {
                distance = 0;
            for (int j = 0; j < matrix.length; j++) {
            distance += Math.sqrt(Math.pow((matrix[i][0]-matrix[j][0]),2) + Math.pow((matrix[i][1]-matrix[j][1]),2));
        }
            if(distance < min){
                min = distance;
                a[0] = distance; //toplam mesafeyi array'in 0. elemaninda tutuyorum.
                a[1] = i; //indexi array'in 1. elemaninda tutuyorum.
            }
        }
        return a;
    }
}

