package Chapters.chapter_10.Exercises.Exercise_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.println("Distance from point1 to point2 is "+ point1.distance(point2));

        MyPoint point3 = new MyPoint(3,0);
        System.out.println("Distance from point3 to other point is "+ point3.distance(0,4));

    }
}
