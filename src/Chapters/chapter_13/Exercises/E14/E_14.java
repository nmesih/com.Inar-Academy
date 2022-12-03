package Chapters.chapter_13.Exercises.E14;

public class E_14 {
    public static void main(String[] args) {
        Rational1 half = new Rational1(1,2);
        Rational1 oneFourth = new Rational1(2,8);

        System.out.println("(1/2) + (1/4) = " + half.add(oneFourth));
        System.out.println("(1/2) - (1/4) = " + half.subtract(oneFourth));
        System.out.println("(1/2) * (1/4) = " + half.multiply(oneFourth));
        System.out.println("(1/2) / (1/4) = " + half.divide(oneFourth));
    }
}
