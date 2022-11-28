package Chapters.chapter_12.Exercises.Exercise_25;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class E_25 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");
        if (!file.exists()) {
            System.out.println("File not found.");
            System.exit(1);
        }

        double totalSalaryOfAssistant = 0;
        int assistantCount = 0;
        double totalSalaryOfAssociate = 0;
        int associateCount = 0;
        double totalSalaryOfFull = 0;
        int fullCount= 0;

        String firstName;
        String lastName;
        String rank = "";
        double salary;
        try (
                Scanner input = new Scanner(file);
        ){
            while(input.hasNext()) {
                firstName = input.next();
                lastName = input.next();
                rank = input.next();
                salary = input.nextDouble();

                if (rank.equals("assistant")) {
                    totalSalaryOfAssistant += salary;
                    assistantCount++;
                }
                else if (rank.equals("associate")) {
                    totalSalaryOfAssociate += salary;
                    associateCount++;
                }
                else {
                    totalSalaryOfFull += salary;
                    fullCount++;
                }
            }

            System.out.println("Total salaries\n------------" + "\nAssistant: " + totalSalaryOfAssistant +
                    "\nAssociate: " + totalSalaryOfAssociate +
                    "\nFull proffesors: " + totalSalaryOfFull);
            System.out.println("\nAverage salaries\n------------" + "\nAssistant: " + (totalSalaryOfAssistant/assistantCount) +
                    "\nAssociate: " + (totalSalaryOfAssociate/associateCount) +
                    "\nFull proffesors: " + (totalSalaryOfFull/fullCount));
        }
    }
}
