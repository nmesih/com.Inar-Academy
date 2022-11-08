package Chapters.chapter_10.Checkpoints;

public class Checkpoint_25 {
    public static void main(String[] args) {
        String s = "Hi, Good Morning";
        System.out.println(m(s)); // count = 3
    }
    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        return count;
    }
}
