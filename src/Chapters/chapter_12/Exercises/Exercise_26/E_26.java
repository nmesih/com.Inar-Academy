package Chapters.chapter_12.Exercises.Exercise_26;

import java.io.File;
import java.util.Scanner;

public class E_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name");
        String name = input.nextLine();

        File file = new File(name);
        boolean b = file.mkdirs();
        if(b){
            System.out.println("Directory created succesfully");
        }else
            System.out.println("Directory already exists");
    }
}
