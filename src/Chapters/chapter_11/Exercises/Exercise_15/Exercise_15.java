package Chapters.chapter_11.Exercises.Exercise_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        int n = input.nextInt();

        ArrayList<Double> list1 = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < n*2; i++) {
            list1.add(input.nextDouble());
        }

        System.out.println("The total area is " + areaOfPolygon(list1, n));
    }

    private static double areaOfPolygon(ArrayList<Double> list1, int n) {

        double area = 0;
        double right = list1.get(0) * list1.get(list1.size() - 1);
        for (int i = 1; i < list1.size() - 1; i+=2) {
            right += list1.get(i) * list1.get(i + 1);
        }

        double[][] arr = new double[n][2];
        for (int i = 0, j = 0; i < arr.length; i++) {
            for (int k = 0; k < 2; k++) {
                arr[i][k] = list1.get(j);
                j++;
            }
        }

        double left = arr[0][1] * arr[n-1][0];
        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            left += arr[i][0] * arr[j][1];
        }

        area = Math.abs((right - left)/2);

        return area;
    }
}
