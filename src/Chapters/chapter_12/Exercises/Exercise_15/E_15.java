package Chapters.chapter_12.Exercises.Exercise_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class E_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\ASUS\\Desktop\\Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("There is already a file with the same name");
            System.exit(1);
        }
        writeRandomIntegers(file);
        sort(file);
    }

    private static void sort(File file) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()){
                list.add(input.nextInt());
            }
        }

        java.util.Collections.sort(list);

        int count = 0;
        while (!list.isEmpty()) {
            count++;
            System.out.printf("%2d ", list.remove(0));
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

    private static void writeRandomIntegers(File file) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = (int) (Math.random() * 100);
                output.print(randomNumber + " ");
            }
        }
    }
}
