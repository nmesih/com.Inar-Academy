package Chapters.chapter_10.Exercises.Exercise_28;

import Chapters.chapter_10.Exercises.Exercise_23.MyString2;

public class MyStringBuilder2 {
    //public MyStringBuilder2();
    //public MyStringBuilder2(char[] chars);
    //public MyStringBuilder2(String s);
    //public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
    //public MyStringBuilder2 reverse();
    //public MyStringBuilder2 substring(int begin);
    //public MyStringBuilder2 toUpperCase();

    private char[] chars;

    public MyStringBuilder2(){

    }

    public MyStringBuilder2(char[] chars){
        this.chars = chars;
    }

    public MyStringBuilder2(String s){
        chars = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        char[] array = new char[s.length()+length()];

        for (int i = 0; i < offset; i++) {
            array[i] = chars[i];
        }
        for (int i = offset; i < s.length()+offset; i++) {
            array[i] = s.charAt(i-offset);
        }
        for (int i = offset + s.length(); i < array.length; i++) {
            array[i] = chars[i - s.length()];
        }
        return new MyStringBuilder2(array);
    }

    private char charAt(int i) {
        return chars[i];
    }

    public MyStringBuilder2 reverse(){
        char[] array = new char[chars.length];
        for (int i = 0, index = chars.length-1; index >= 0 ; i++, index--) {
             array[i] = chars[index];
        }
        return new MyStringBuilder2(array);
    }

    public MyStringBuilder2 substring(int begin){
        char[] array = new char[chars.length-begin];
        for (int i = begin; i < chars.length; i++) {
            array[i-begin] = chars[i];
        }
        return new MyStringBuilder2(array);
    }

    public MyStringBuilder2 toUpperCase(){
        char[] ch = new char[chars.length];
        for (int i = 0; i < ch.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                ch[i] = (char) (chars[i] - ('a' - 'A'));
            } else {
                ch[i] = chars[i];
            }
        }
        return new MyStringBuilder2(ch);
    }

    private int length() {
        return chars.length;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < length(); i++) {
            output += charAt(i);
        }
        return output;
    }
}
