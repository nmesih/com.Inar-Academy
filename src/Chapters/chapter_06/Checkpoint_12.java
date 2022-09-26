package Chapters.chapter_06;

public class Checkpoint_12 {
    public static void main(String[] args) {
        nPrintln("Welcome to Java!", 5); // Replaced integer with string
    }

    public static void nPrintln(String message, int n) {
        n = 5;    //int was already declared
        for (int i = 0; i < n; i++) {   // Added brace to for
            System.out.println(message);
        }
    }
}

