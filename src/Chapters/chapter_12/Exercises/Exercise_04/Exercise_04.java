package Chapters.chapter_12.Exercises.Exercise_04;

public class Exercise_04 {
    public static void main(String[] args) {

        try {
            new NewLoan(10, 10, 185000);
            NewLoan a = new NewLoan(-1, 3, 3);

        }
        catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("End");

    }
}
