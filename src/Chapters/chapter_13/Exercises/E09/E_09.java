package Chapters.chapter_13.Exercises.E09;

public class E_09 {
    public static void main(String[] args) {

        Circle1 c1 = new Circle1(3);
        Circle1 c2 = new Circle1(3);
        Circle1 c3 = new Circle1(4);


        System.out.println("Is c1 equal c2 ? " + c1.equals(c2));
        System.out.println("Is c1 equal c3 ? " + c1.equals(c3));
        System.out.println(c3.compareTo(c2) == 1 ? "c1 larger than c2" : "c2 not larger than c1");
    }
}
