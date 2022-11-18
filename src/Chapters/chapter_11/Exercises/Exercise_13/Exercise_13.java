package Chapters.chapter_11.Exercises.Exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    final static int ARRAYLIST_SIZE = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
        System.out.print("The distinct integers are : ");
        removeDuplicate(list);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            int count = 0;
            for (int j = i + 1; j < ARRAYLIST_SIZE; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 0) {
                arrayList.add(list.get(i));
            }

        }
        System.out.println(arrayList);
    }
}
