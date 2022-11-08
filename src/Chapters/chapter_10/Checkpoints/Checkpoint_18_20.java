package Chapters.chapter_10.Checkpoints;

public class Checkpoint_18_20 {
    public static void main(String[] args) {

        System.out.println("Checkpoint 18");

        String s1 = "Welcome";
        System.out.println("s1 = " + s1);
        String s2 = "welcome";
        System.out.println("s2 = " + s2);

        s2 = s1.replaceAll("e", "E");
        System.out.println("s2 = " + s2);

        String[] arr = "Welcome to Java and HTML".split(" ");
        s1 = arr[0];
        System.out.println("s1 = " + s1);
        s2 = arr[1];
        System.out.println("s2 = " + s2);
        String s3 = arr[2];
        System.out.println("s3 = " + s3);

        System.out.println("Checkpoint 20");
        System.out.println("Length of new String() is " + new String().length());

    }
}
