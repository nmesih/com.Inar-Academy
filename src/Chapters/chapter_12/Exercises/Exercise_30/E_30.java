package Chapters.chapter_12.Exercises.Exercise_30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class E_30 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name");
        String fileName = input.nextLine();

        File file = new File(fileName);

        int[] counts = new int[26];

        try (
                Scanner fileInput = new Scanner(file)
        ) {
            while (fileInput.hasNext()) {
                String line = fileInput.nextLine();

            for (int i = 0; i < line.length(); i++) {
                if(Character.isLetter(line.charAt(i))){
                    counts[Character.toUpperCase(line.charAt(i)) - 'A']++;
                }
            }

                for (int i = 0; i < counts.length; i++) {
                    System.out.println("Number of " + (char) (i + 'A') + "'s is "
                            + counts[i]);
                }
            }
        }
    }
}
