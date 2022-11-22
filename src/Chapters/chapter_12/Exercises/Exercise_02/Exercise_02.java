package Chapters.chapter_12.Exercises.Exercise_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter two integers: ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("Sum is " + (num1+num2));

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input! Please enter integer.)");
                input.nextLine();
            }
        } while (continueInput);

    }
}
