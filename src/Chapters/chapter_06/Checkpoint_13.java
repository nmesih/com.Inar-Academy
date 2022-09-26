package Chapters.chapter_06;

public class Checkpoint_13 {
    public static void main(String[] args) {
        int max = 0;
        max(1, 2, max);
        max(8,9,max);
    }
    public static void max(
            int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
        System.out.println(max);
    }
}

