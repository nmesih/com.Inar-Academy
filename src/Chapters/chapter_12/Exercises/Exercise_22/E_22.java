package Chapters.chapter_12.Exercises.Exercise_22;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class E_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldStr newStr");
            System.exit(1);
        }

        File directory = new File(args[0]);
        System.out.println();

        if (!directory.exists()) {
            System.out.println("There isn't any directory");
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);

        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    } else {
                        replace(files[i], args[1], args[2]);
                    }
                }
            }
        }
        System.out.println("Text replacement successful");
    }

    private static void replace(File file, String arg, String arg1) throws Exception {
        String str = "";
        StringBuilder sb = new StringBuilder();

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()){
                str = input.nextLine();
                sb.append(str.replaceAll(arg,arg1)+"\n");
            }

            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                output.print(sb);
            }
        }
    }
}
