package Chapters.chapter_10.Exercises.Exercise_27;

import Chapters.chapter_10.Exercises.Exercise_28.MyStringBuilder2;

import java.util.Arrays;

public class TestMyStringsBuilder {
    public static void main(String[] args) {
        MyStringBuilder1 strbuilder = new MyStringBuilder1("Java");
        System.out.println("Object ----> " + strbuilder.toString());
        strbuilder.append(1907);
        MyStringBuilder1 yeni = new MyStringBuilder1("Academy");
        strbuilder.append(yeni);
        System.out.println("After append method ----> " + strbuilder.toString());
        System.out.println("The lenght of the object " + strbuilder.length());
        strbuilder.substring(4,15);
        System.out.println("After substring method ----> " + strbuilder.toString());

        System.out.println("The fifth char ---> " + strbuilder.charAt(5));
        System.out.println("After lower case method ----> " + strbuilder.toLowerCase());

        MyStringBuilder2 yenim = new MyStringBuilder2("NURULLAH");

        System.out.println(yenim.substring(5));

    }
}
