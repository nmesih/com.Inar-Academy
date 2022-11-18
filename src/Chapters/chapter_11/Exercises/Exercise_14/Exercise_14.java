package Chapters.chapter_11.Exercises.Exercise_14;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_14 {
    final static int ARRAYLIST_SIZE = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter five integers for list1:");
        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            list1.add(input.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter five integers for list2:");
        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            list2.add(input.nextInt());
        }

        displayUnion(union(list1,list2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < ARRAYLIST_SIZE ; i++) {
            union.add(list1.get(i));
        }

        for (int i = 0; i < ARRAYLIST_SIZE ; i++) {
            union.add(list2.get(i));
        }

        return union;
    }

    private static void displayUnion(ArrayList<Integer> union) {
        System.out.print("The combined list is ");
        for (Integer integer : union) {
            System.out.print(integer + " ");
        }
    }
}
