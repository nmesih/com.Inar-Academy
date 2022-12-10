package Chapters.Java_Set_Map_Exercises;

import java.util.*;

public class Set_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        if (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        }

        Set<Integer> set = new HashSet<>();
        set.add(answer);

        while (number1 + number2 != answer) {
            answer = input.nextInt();
            if (number1 + number2 == answer) {
                break;
            }
            if (set.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            } else {
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            }
            set.add(answer);
        }

        System.out.println("You got it!");
    }
}
