package Chapters.chapter_13.Exercises.E10;

import Chapters.chapter_13.Exercises.E09.Circle1;

public class E_10 {
    public static void main(String[] args) {

        Rectangle1 r1 = new Rectangle1(5,6);
        Rectangle1 r2 = new Rectangle1(2.5,12);
        Rectangle1 r3 = new Rectangle1(2,10.0);


        System.out.println("Is r1 equal r2 ? " + r1.equals(r2));
        System.out.println("Is r1 equal r3 ? " + r1.equals(r3));
        System.out.println(r2.compareTo(r3) == 1 ? "r2 larger than r3" : "r2 not larger than r3");
    }
}
