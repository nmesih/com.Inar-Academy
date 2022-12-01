package Chapters.chapter_13.Exercises.E03;

import java.util.ArrayList;

public class E_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(5);
        list.add(3.33);
        list.add(3.98);
        list.add(99);
        list.add(-2.3);
        list.add(0);
        list.add(12.087);
        list.add(0.18);

        displayArraylist(list);
        sort(list);
        System.out.println("\n--------------");;
        displayArraylist(list);
    }

    public static void sort(ArrayList<Number> list){
        Number temp;
        Number temp2;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    temp = list.get(i);
                    temp2 = list.get(j);
                    list.set(j, temp);
                    list.set(i, temp2);
                }
            }
        }
    }

    private static void displayArraylist(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
