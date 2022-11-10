package Chapters.chapter_10.Exercises.Exercise_11;

public class TestCircle2D {
    // creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
    //displays its area and perimeter, and displays the result of c1.contains(3,
    //3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
    //Circle2D(3, 5, 2.3)).
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Center of circle1: (" + c1.getX() + ", " + c1.getY() + ")");
        System.out.println("Radius of circle1 is " + c1.getRadius());
        System.out.println("Area of circle1 is " + c1.getArea());
        System.out.println("Perimeter of circle1 is " + c1.getPerimeter());

        System.out.println("Is the point (3, 3) inside the circle1?");
        System.out.println(c1.contains(3,3) ? "Yes" : "No");

        System.out.println("Does the circle1 contain the circle with center (3, 4) and radius 5?");
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)) ? "Yes" : "No");

        System.out.println("Does the circle1 overlap the circle with center (3, 5) and radius 2,3?");
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)) ? "Yes" : "No");



    }
}
