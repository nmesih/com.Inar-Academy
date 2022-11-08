package Chapters.chapter_10.Checkpoints;

public class Checkpoint_24 {
    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC ")); // false
        System.out.println("Hi, ABC, good".matches(".*ABC.*")); // true
        System.out.println("A,B;C".replaceAll(",;", "#")); // A,B;C
        System.out.println("A,B;C".replaceAll("[,;]", "#")); // A#B#C
        String[] tokens = "A,B;C".split("[,;]"); // A B C
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
    }
}
