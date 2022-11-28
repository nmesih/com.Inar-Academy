package Chapters.chapter_12.Exercises.Exercise_23;

import java.io.File;
import java.util.Scanner;

public class E_23 {
    public static void main(String[] args) throws Exception {
        File file = new File("Scores.txt");


        int count = 0;
        int sum = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()){
                int a = input.nextInt();
                count ++;
                sum += a;
            }

        }
        System.out.println("Number of points: " + count +"\nSum of points: " + sum +
                "\nAverage of points: " + (sum/count));
    }
}
