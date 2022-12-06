package Chapters.Java_Set_Map_Exercises.ArrayList;

import java.io.File;
import java.util.*;

public class ArrayList_05 {
    public static void main(String[] args) throws Exception {
        File file = new File("metin.txt");
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
                ){
            while (input.hasNext()){
                String s = input.next();
                list.add(s.toLowerCase(Locale.ROOT));
            }
        }
        for (int i = 0; i < list.size(); i++) {

        }

        Collections.sort(list);

        System.out.println(list);
    }
}
