package Chapters.chapter_12.Exercises.Exercise_13;

import java.io.*;
import java.util.Scanner;

public class E_13 {
    public static void main(String[] args) throws Exception{


        if (args.length != 1) {
            System.out.println("Wrong usage : Takes one argument and its file name ");
            System.exit(1);
        }
        File file = new File(args[0]);

        if(!file.exists()){
            System.out.println("There is no such file");
            System.exit(2);
        }

        String str = "";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                str = input.nextLine();
                lineCount++;
                charCount += countChars(str);
                wordCount += countWords(str);
            }
        }
        System.out.println("Number of lines : " + lineCount + "\n Number of chars : " + charCount +
                "\n Number of words : " + wordCount);
    }

    private static int countWords(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    private static int countChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
