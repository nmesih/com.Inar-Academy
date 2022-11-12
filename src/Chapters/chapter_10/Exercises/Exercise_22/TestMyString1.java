package Chapters.chapter_10.Exercises.Exercise_22;

import Chapters.chapter_10.Exercises.Exercise_28.MyStringBuilder2;

public class TestMyString1 {
    public static void main(String[] args) {
        MyString1 a = new MyString1(new char[]{'A', 'R', 'D', 'A', ' ' ,'G', 'U', 'L', 'E', 'R'});
        System.out.println(a.toString());
        MyString1 b = a.toLowerCase();
        System.out.println("lowercase --->" + b);
        MyString1 c = b.substring(0, 3);
        System.out.println("substring ---> " + c);
        System.out.println("length ---> " + c.length());
        System.out.println("equals ---> " + a.equals(b));
        MyString1 d = new MyString1(new char[]{'F', 'e', 'r', 'd', 'i'});
        System.out.println(a.equals(d));
        MyString1 e = MyString1.valueOf(5552);
        System.out.println(e);
    }
}
