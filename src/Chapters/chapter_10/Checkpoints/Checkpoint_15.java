package Chapters.chapter_10.Checkpoints;

public class Checkpoint_15 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println("a = " + (s1 == s2) );  // true
        System.out.println("b = " + (s1 == s3) );  // false
        System.out.println("c = " + (s1 == s4) );  // true
        System.out.println("d = " + (s1.equals(s3)));  // true
        System.out.println("e = " + (s1.equals(s4)));   // true
        System.out.println("f = " + ("Welcome to Java".replace("Java", "HTML"))); //Welcome to HTML
        System.out.println("g = " + (s1.replace('o', 'T'))); // WelcTme tT Java
        System.out.println("h = " + (s1.replaceAll("o", "T"))); // WelcTme tT Java
        System.out.println("i = " + (s1.replaceFirst("o", "T"))); //WelcTme to Java
        System.out.println("j = " + (s1.toCharArray()));
    }
}
