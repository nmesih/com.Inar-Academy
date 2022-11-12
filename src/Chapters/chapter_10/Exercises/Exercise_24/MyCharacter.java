package Chapters.chapter_10.Exercises.Exercise_24;

public class MyCharacter {

    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public static char getValueOf(MyCharacter ch) {
        return ch.getChar();
    }

    private char getChar() {
        return this.ch;
    }

    public boolean compareTo(MyCharacter c) {
        return this.ch == c.getChar();
    }

    public String toString() {
        String str = ch + "";
        return str;
    }

    public char toLowerCase() {

        if (ch <= 'Z' && ch >= 'A') {
            ch = (char) (ch + ('a' - 'A'));
        } else {
            ch = ch;
        }
        return ch;
    }

    public char toUpperCase() {

        if (ch <= 'z' && ch >= 'a') {
            ch = (char) (ch - ('a' - 'A'));
        } else {
            ch = ch;
        }
        return ch;
    }

    public boolean isLetter() {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public boolean isDigit() {
        return (this.ch >= '0' && this.ch <= '9');
    }

    public boolean isDigitOrLetter() {
        return this.isDigit() || this.isLetter();
    }

}
