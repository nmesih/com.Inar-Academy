package Chapters.chapter_13.Exercises.E05;

public class E_05 {
    public static void main(String[] args) {

        GeometricObject1 circle1 = new Circle(5);
        GeometricObject1 circle2 = new Circle(3.4);
        System.out.println(circle1.compareTo(circle2));

        Rectangle rectangle1 = new Rectangle(5,10);
        GeometricObject1 rectangle2 = new Rectangle(3,20);
        System.out.println(rectangle1.compareTo(rectangle2));

    }
}
