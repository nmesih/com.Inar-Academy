package Chapters.chapter_12.Exercises.Exercise_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class E_21 {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<String> list = new ArrayList<>();
        File file = new File("C:/Users/ASUS\\Desktop/sehir.txt");

        try (
                Scanner input = new Scanner(file);
        ){
            while (input.hasNext()){
                String str = input.next();
                list.add(str);
            }
            if(!isSorted(list)){
                System.out.println("Strings are sorted");
            } else{
                System.out.println("Strings are not sorted.First two strings out of order is " +
                        list.get(0) + "," + list.get(1));
            }
        }
    }

    private static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).compareTo(list.get(i+1)) > 0){
                return true;
            }
        }
        return false;
    }
}