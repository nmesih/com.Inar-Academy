package Chapters.chapter_13.Listings;

import java.util.*;

public class Set_List_Exercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(0);
        list.add(-1);
        list.add(5);

        System.out.println(min(list));

        ArrayList<Integer> list1 = randomArray(15);
        System.out.println(Arrays.toString(list1.toArray()));
        Set unique = findUnique(list1);
        System.out.println(Arrays.toString(unique.toArray()));


    }

    private static Set findUnique(ArrayList<Integer> list1) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            unique.add(list1.get(i));
        }
        return unique;
    }

    private static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) < min){
                min = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static ArrayList<Integer> randomArray(int a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add((int)(Math.random()*10));
        }

        return list;
    }


}
