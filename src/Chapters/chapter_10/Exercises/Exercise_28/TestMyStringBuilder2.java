package Chapters.chapter_10.Exercises.Exercise_28;

public class TestMyStringBuilder2 {

    public static void main(String[] args) {
        MyStringBuilder2 a = new MyStringBuilder2("fenerbahce");
        System.out.println(a);
        System.out.println("substring --> " + a.substring(5));
        System.out.println("reverse --> " + a.reverse());
        System.out.println("insert --> " + a.insert(5, new MyStringBuilder2("1907")));
        System.out.println("Uppercase --> " + a.toUpperCase());

    }
}
