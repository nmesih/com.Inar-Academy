package Chapters.chapter_13.Exercises.E11;

public class E_11 {
    public static void main(String[] args) {
        Octagon o1 = new Octagon(5);
        System.out.println(o1);
        System.out.println("----------------");
        Octagon o2 = (Octagon) o1.clone();
        System.out.println(o2);

        System.out.println(o1.compareTo(o2) == 0 ? "o1 and o2 are equal" : "o1 and o2 are not equal");

    }
}
