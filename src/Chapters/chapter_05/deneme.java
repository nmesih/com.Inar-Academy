package Chapters.chapter_05;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java E12_12 [filename]");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println(args[0] + " doesn't exist!");
            System.exit(1);
        }

        String str = "";

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                str += input.nextLine() + "\n";
            }
            str = str.replaceAll("\n\\s*\\{", " {");
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(str);

        }
    }
}
