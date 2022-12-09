package Chapters.Java_Set_Map_Exercises;

import java.util.*;

public class Set_04 {
    public static void main(String[] args) {

        System.out.println("Enter five integers for list1: ");
        ArrayList<Integer> list1 = inputFromUser(5);
        System.out.println("Enter five integers for list2: ");
        ArrayList<Integer> list2 = inputFromUser(5);

        System.out.println("The combined list is " + union(list1,list2));
    }

    private static Set union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set union = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            union.add(list1.get(i));
            union.add(list2.get(i));
        }
        return union;
    }

    private static ArrayList<Integer> inputFromUser(int size){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
