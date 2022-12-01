package Chapters.chapter_13.Exercises.E02;

import java.util.ArrayList;

public class E_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Number x = (Math.random()*10);
            list.add(x.intValue());
        }
        displayArraylist(list);
        shuffle(list);
        System.out.println("\n--------------------");
        displayArraylist(list);

    }

    public static void shuffle(ArrayList<Number> list){
        int index;
        Number temp;
        for (int i = 0; i < list.size(); i++) {
            index = (int) (Math.random() * list.size());
            temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }

    private static void displayArraylist(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
