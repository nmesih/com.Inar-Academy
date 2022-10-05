package Chapters.chapter_06;

import java.util.Scanner;

public class C06E36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        System.out.println("The area is " + area(numberOfSides,side));
    }
    public static double area(int n, double side){
        double area = (n * side * side) / (4 * Math.tan(Math.PI/n));
        return area;
    }

}
