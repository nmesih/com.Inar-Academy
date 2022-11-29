package Chapters.chapter_12.Exercises.Exercise_32;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class E_32 {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5",
                "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s", 2010 - i + "");
            File file = new File("names" + (2010-i) + ".txt");
            displayNames(file);
        }
    }

        private static void displayNames (File file) throws Exception {
            ArrayList<String> femaleNames = new ArrayList<>();
            ArrayList<String> maleNames = new ArrayList<>();
            int count = 0;
            try (
                    Scanner input = new Scanner(file)
            ) {
                while (count < 5) {
                    int rank = input.nextInt();
                    maleNames.add(input.next());
                    double maleBirthRate = input.nextDouble();
                    femaleNames.add(input.next());
                    double femaleBirthRate = input.nextDouble();
                    count++;
                }
            }

            for (int i = 0; i < 5; i++) {
                System.out.printf("%-10s", femaleNames.remove(0));
            }
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-10s", maleNames.remove(0));
            }
            System.out.println();

        }
    }

