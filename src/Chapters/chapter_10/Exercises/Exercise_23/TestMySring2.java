package Chapters.chapter_10.Exercises.Exercise_23;

public class TestMySring2 {
    public static void main(String[] args) {
        MyString2 str = new MyString2("Hello Java");
        System.out.print(str.toString() + "\nAfter substring method: ");
        System.out.println(str.substring(3).toString());
        MyString2 yeni = new MyString2("Academy");
        String a = "Academic";
        System.out.println("compare method " + yeni.compare(a));
        System.out.println("Upper case method " + yeni.toUpperCase());
        System.out.println("Value of " + MyString2.valueOf(yeni.equals(a)));

    }
}
