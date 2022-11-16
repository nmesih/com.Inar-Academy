package Chapters.chapter_11.Exercises.Exercise_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers");

        while (true) {
            int numb = input.nextInt();
            if (numb == 0) {
                break;
            } else
                list.add(numb);
        }

        System.out.println(list);
        System.out.println("Max element of the list ---> " + max(list));

        ArrayList<Integer> list2 = null;
        System.out.println(list2);
        System.out.println("Max element of the list2 ---> " + max(list2));

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max.compareTo(list.get(i)) == -1){
                max = list.get(i);
            }
        }
        return max;
    }
}




