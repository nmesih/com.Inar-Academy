package Chapters.chapters_08;

import java.util.Scanner;

public class C08E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, \n1-married jointly \nor " +
                "qualifying widow(er), \n2-married separately, \n3-head of " +
                "household) \nEnter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        System.out.println("Tax is " + tax(rates, brackets, income, status));

    }

    public static double tax(double[] rates, int[][] brackets, double income, int status) {
        double tax = 0;

        if (income < brackets[status][0]) {
            return 0;
        }
        for (int i = brackets[status].length - 1; i >= 0; i--) {
            if (income > brackets[status][i]) {
                tax += (income - brackets[status][i]) * rates[i + 1];
                income = brackets[status][i];
            }
        }
        tax += brackets[status][0] * rates[0];
        return tax;
    }
}
