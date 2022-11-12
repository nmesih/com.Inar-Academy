package Chapters.chapter_10.Exercises.Exercise_23;

public class MyString2 {
    //public MyString2(String s);
    //public int compare(String s);
    //public MyString2 substring(int begin);
    //public MyString2 toUpperCase();
    //public char[] toChars();
    //public static MyString2 valueOf(boolean b);

    private char[] chars;

    public MyString2(String s) {
        chars = s.toCharArray();
    }

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public int compare(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] > s.charAt(i)) {
                return 1;
            } else if (chars[i] < s.charAt(i)) {
                return -1;
            } else {
                continue;
            }
        }
        return 0;
    }

    public MyString2 substring(int begin) {
        String str = "";
        for (int i = begin; i < chars.length; i++) {
            str += chars[i] + "";
        }
        return new MyString2(str);
    }

    public MyString2 toUpperCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < ch.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                ch[i] = (char) (chars[i] - ('a' - 'A'));
            } else {
                ch[i] = chars[i];
            }
        }
        return new MyString2(ch);
    }
    public char[] toChars(){
        return chars;
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += chars[i];
        }
        return str;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(b ? "true" : "false");
    }

}
