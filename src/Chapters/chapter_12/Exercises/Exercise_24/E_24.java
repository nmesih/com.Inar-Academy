package Chapters.chapter_12.Exercises.Exercise_24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class E_24 {
    public static void main(String[] args) throws IOException {
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ){
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i + " ");
                int rank = (int) (Math.random()*3);

                switch (rank) {
                    case 0:
                        output.printf("assistant %.2f", 50000 + Math.random() * 30000);
                        break;
                    case 1:
                        output.printf("associate %.2f", 60000 + Math.random() * 50000);
                        break;
                    case 2:
                        output.printf("full %.2f", 75000 + Math.random() * 55000);
                        break;
                }
                    output.println();
            }
        }
        System.out.println("End of the program!");
    }
}
