package Chapters.chapter_06;

import java.util.Scanner;

public class C06E07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double rate = input.nextDouble();
        rate = rate / 1200;
        System.out.printf("%-10s%-10s", "Years", "Future Value");
        System.out.println();
        double futureInvestment = investmentAmount;
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-9d", years);
            System.out.printf("%10.2f\n", futureInvestmentValue(investmentAmount, rate, years));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double rate, int years) {
        return investmentAmount * Math.pow((1 + rate), years * 12);

    }
}