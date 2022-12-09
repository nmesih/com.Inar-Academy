package Chapters.Java_Set_Map_Exercises;

import java.util.*;

public class Set_03 {
    /**
     * (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values
     * in the array using the following method header:
     * public static int[] eliminateDuplicates(int[] list)
     * Write a test program that reads in ten integers, invokes the method, and displays the result.
     */
    public static void main(String[] args) {
            System.out.println("Enter ten numbers :");
            ArrayList<Integer> list = inputFromUser();

            Set distinct = findUnique(list);
            System.out.println("The distinct numbers are: " + distinct);
        }

        private static Set findUnique(ArrayList<Integer> list1) {
            Set<Integer> unique = new HashSet<>();
            unique.addAll(list1);
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

