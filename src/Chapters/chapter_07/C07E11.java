package Chapters.chapter_07;

import java.util.Scanner;

public class C07E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[]array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f", mean(array));
        System.out.printf("\nThe standart deviation is %.5f" , deviation(array));
    }
    public static double deviation(double[] array){
        double squareSum = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            squareSum += (array[i] * array[i]);
        }
        double sDeviation = Math.sqrt( ((squareSum) - ((sum * sum) / 10.0)) / 9.0);
        return sDeviation;

    }

    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        double mean = sum / 10.0;
        return mean;
    }
}
