package Chapters.chapter_11.Exercises.Exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(answer);
        if (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        }

        while (number1 + number2 != answer) {
            answer = input.nextInt();
            if (number1 + number2 == answer) {
                break;
            }
            if (list.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            } else {
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            }
            list.add(answer);
        }

        System.out.println("You got it!");
    }
}
