package Chapters.chapter_12.Listings;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("C:\\Users\\ASUS\\Desktop\\Mesih\\yeni.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();

    }
}
