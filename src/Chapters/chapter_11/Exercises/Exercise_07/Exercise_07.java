package Chapters.chapter_11.Exercises.Exercise_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_07 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        shuffle(list);
        System.out.println(list);

    }
    public static void shuffle(ArrayList<Integer> list){
        int index;
        int temp;
        for (int i = 0; i < list.size(); i++) {
            index = (int)(Math.random()*10);
            temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i,temp);
        }
    }
}
