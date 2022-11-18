package Chapters.chapter_11.Exercises.Exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println("Your list ---> " + list);
        sort(list);
        System.out.println("Your list after sorting --->" + list);

    }

    public static void sort(ArrayList<Integer> list) {
        int temp;
        int temp2;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    temp2 = list.get(j);
                    list.set(j, temp);
                    list.set(i, temp2);
                }
            }
        }
    }
}
