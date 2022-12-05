package Chapters.Java_Set_Map_Exercises.ArrayList;

import java.util.*;

public class ArrayList_02 {
    /**
     * (Count single digits) Write a program that generates 100 random integers between
     * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
     * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = randomArray();
        System.out.println("Arraylist is : " + Arrays.toString(list.toArray()));
        countNumbers(list);


    }
    public static void countNumbers(ArrayList<Integer> list) {
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (Integer j : list) {
                if (j == i) {
                    count++;
                }
            }
            System.out.printf("The count for %-2d is %-2d \n", i, count);
        }
    }

    private static ArrayList<Integer> randomArray(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*10));
        }
        return list;
    }
}
