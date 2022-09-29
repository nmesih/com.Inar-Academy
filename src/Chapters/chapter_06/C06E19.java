package Chapters.chapter_06;

import java.util.Scanner;

public class C06E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(isValid(a,b,c)==true){
            System.out.println("The area of triangle is " + area(a,b,c));
        } else {
            System.out.println("Inputs are invalid.");
        }
    }
    public static boolean isValid(double side1, double side2, double side3){
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        } else
            return false;
    }
    public static double area(double side1, double side2, double side3){
        double perimeter = (side1 + side2 + side3) / 2;
        double area = Math.pow( perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3 ) , 0.5);
        return area;
    }
}
