package Chapters.chapter_12.Exercises.Exercise_14;

import java.io.File;
import java.util.Scanner;

public class E_14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file: ");
        String name = input.nextLine();
        File file = new File(name);

        if (!file.exists()) {
            System.out.println("File  does not exist");
            System.exit(1);
        }

        int sum = 0;
        int count =0;

        try(
                Scanner fileInput = new Scanner(file);
                ) {

            while (fileInput.hasNext()){
                sum += fileInput.nextInt();
                count++;
            }

        }
        System.out.println("Total is " + sum +"\nNumber of integers " + count + "\nAverage is " + (sum/count));
    }
}
