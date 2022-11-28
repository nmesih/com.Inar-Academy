package Chapters.chapter_12.Exercises.Exercise_27;

import java.io.File;

public class E_27 {
    public static void main(String[] args) {
        System.out.println("Usage: java Exercise12_27 * ");

        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (s.matches("Exercise\\d+_\\d+")) {
                String newName = s.substring(0, s.indexOf('_') - 1)
                        + "0" + s.substring(s.indexOf('_') - 1, s.indexOf('_') +1 ) + "0" +
                        s.substring(s.indexOf('_') + 1);

                File file = new File(s);
                file.renameTo(new File(newName));
            }
        }
    }
}
