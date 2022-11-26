package Chapters.chapter_12.Exercises.Exercise_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class E_11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 StringThatWillRemoved fileName");
            System.exit(1);
        }

        File file = new File(args[1]);
        String s = "";
        StringBuilder sb = new StringBuilder();

        try (
                Scanner input = new Scanner(file)
        ){
          while(input.hasNext()){
              s = input.nextLine();
              sb.append(s.replaceAll(args[0] + " ", "") + "\n");
          }
        }

        try (
                PrintWriter output = new PrintWriter(file);
                ){
            output.print(sb);

        }
    }
}
