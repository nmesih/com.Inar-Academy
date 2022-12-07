package Chapters.Java_Set_Map_Exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_01 {
    /**
     * (Print distinct numbers) Write a program that reads in ten numbers and displays
     * the number of distinct numbers and the distinct numbers separated by exactly one
     * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
     * Read a number and store it to an array if it is new. If the number is already in the
     * array, ignore it.) After the input, the array contains the distinct numbers.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter ten numbers :");
        ArrayList<Integer> list = inputFromUser();

        Set<Integer> distinct = findUnique(list);
        System.out.println("The number of distinct number is " + distinct.size());
        System.out.println("The distinct numbers are: " + distinct);
    }

    private static Set findUnique(ArrayList<Integer> list1) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            unique.add(list1.get(i));
        }
        return unique;
    }

    private static ArrayList<Integer> inputFromUser(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
