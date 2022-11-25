package Chapters.chapter_12.Exercises.Exercise_19;

import java.net.URL;
import java.util.Scanner;

public class E_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.anayasa.gen.tr/adalet.htm");

        String line;
        String[] str;
        int count = 0;

        try (
                Scanner input = new Scanner(url.openStream());
        ) {
            while (input.hasNext()) {
                line = input.nextLine() + "\n";
                str = line.split(" ");
                count += str.length;
            }
        }
        System.out.println("https://www.anayasa.gen.tr/adalet.htm has " + count + " words");
    }
}
