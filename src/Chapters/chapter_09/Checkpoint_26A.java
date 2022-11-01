package Chapters.chapter_09;

import java.util.Date;

public class Checkpoint_26A {
        public static void main(String[] args) {
            Date date = null;
            m1(date);
            System.out.println(date);

            Date date1 = new Date(1234567);
            m2(date1);
            System.out.println(date.getTime());
        }

        public static void m1(Date date) {
            date = new Date();
    }
        public static void m2(Date date) {
             date = new Date(7654321);
    }
}
