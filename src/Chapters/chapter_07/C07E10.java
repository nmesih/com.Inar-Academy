package Chapters.chapter_07;

import java.util.Scanner;

public class C07E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[]array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The index of the smallest element is " + indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                temp=i;
            }
        }
        return temp;
    }
}
