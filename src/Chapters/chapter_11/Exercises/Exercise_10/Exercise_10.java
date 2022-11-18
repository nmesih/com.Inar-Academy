package Chapters.chapter_11.Exercises.Exercise_10;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a String : ");
            String s = input.nextLine();
            stack.push(s);
        }
        System.out.println("Stack size --> " + stack.size());
        System.out.println(stack);

        stack.add(2, "Java");
        System.out.println(stack.peek());

        System.out.print("(");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(")\nStack size -->" + stack.size());
    }
}
