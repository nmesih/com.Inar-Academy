package Chapters.Java_Set_Map_Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_03 {
    /**
     * The reverse method in Section  7.7 reverses an array by copying it to a new array.
     * Rewrite the method that reverses the array passed in the argument and returns this array.
     * Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers,
     * and displays the numbers.
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        System.out.println(list);

        list = reversedArray(list);

        System.out.println(list);

    }

    private static ArrayList<Integer> reversedArray(ArrayList<Integer> list) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = 9; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }
}
