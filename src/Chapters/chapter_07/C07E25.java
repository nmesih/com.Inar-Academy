package Chapters.chapter_07;

import java.util.Scanner;

public class C07E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        System.out.println("Enter a,b,c: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        double[] roots = new double[2];
        roots[0] = (-eqn[1] + (Math.pow(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]), 0.5))) / (2 * eqn[0]);
        roots[1] = (-eqn[1] - (Math.pow(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]), 0.5))) / (2 * eqn[0]);

        int rootNumber = solveQuadratic(eqn, roots);

        if (rootNumber == 0) {
            System.out.print("The equation has no real roots.");
        } else
            printRoots(roots, rootNumber);

    }
    private static void printRoots(double[] roots, int rootNumber) {
        for (int i = 0; i < rootNumber; i++) {
            System.out.println("Root " + (i + 1) + " = " + roots[i]);
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double discriminant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if (discriminant > 0){
           return 2;
        } else if (discriminant == 0) {
            return 1;
        } else
            return 0;
    }
}
