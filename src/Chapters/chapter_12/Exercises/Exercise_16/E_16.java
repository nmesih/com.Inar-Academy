package Chapters.chapter_12.Exercises.Exercise_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class E_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
            System.exit(1);
        }

        //java Exercise12_16 file oldString newString

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("The file you point is not exists!");
            System.exit(2);
        }

        File newFile = new File("NewText.txt");

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(newFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                output.println(s2);
            }
        }
    }
}
