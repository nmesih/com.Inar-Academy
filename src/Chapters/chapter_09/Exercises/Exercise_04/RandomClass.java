package Chapters.chapter_09.Exercises.Exercise_04;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random mat = new Random(1000);

        int count = 0;
        for (int i = 0; i < 50; i++) {
            System.out.printf("%3d",mat.nextInt(100));
            count++;

            if(count == 10){
                System.out.println();
                count = 0;
            }
        }

    }
}
