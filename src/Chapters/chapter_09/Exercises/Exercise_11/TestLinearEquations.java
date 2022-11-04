package Chapters.chapter_09.Exercises.Exercise_11;

import java.util.Scanner;


public class TestLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation solution = new LinearEquation(a,b,c,d,e,f);

        if(solution.isSolvable()){
            System.out.println("x is " + solution.getX() + " and y is " + solution.getY());
        }else
            System.out.println("The equation has no solution");
    }
}
