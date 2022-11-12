package Chapters.chapter_10.Exercises.Exercise_24;

public class TestMyChar {
    public static void main(String[] args) {
        MyCharacter a = new MyCharacter('a');
        System.out.println(a);

        MyCharacter b = new MyCharacter('B');
        System.out.println(b.toLowerCase());

        System.out.println(a.compareTo(b));

        System.out.println(MyCharacter.getValueOf(a));

        System.out.println(a.toUpperCase());

        System.out.println(a.isLetter());
        System.out.println(b.isDigit());
        MyCharacter c = new MyCharacter('3');
        System.out.println(c.isDigit());
        System.out.println(c.isDigitOrLetter());
        MyCharacter d = new MyCharacter('+');
        System.out.println(d.isDigitOrLetter());
    }
}
