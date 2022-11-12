package Chapters.chapter_10.Exercises.Exercise_12;

import Chapters.chapter_10.Exercises.Exercise_04.MyPoint;

public class Triangle2D {
    //
    private MyPoint x;
    private MyPoint y;
    private MyPoint z;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(0, 0), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint x, MyPoint y, MyPoint z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MyPoint getX() {
        return x;
    }

    public void setX(MyPoint x) {
        this.x = x;
    }

    public MyPoint getY() {
        return y;
    }

    public void setY(MyPoint y) {
        this.y = y;
    }

    public MyPoint getZ() {
        return z;
    }

    public void setZ(MyPoint z) {
        this.z = z;
    }

    public double getArea(){

        double s = getPerimeter() / 2;
        return Math.sqrt(s *
                (s - x.distance(y)) *
                (s - y.distance(z)) *
                (s - z.distance(x)));
    }

    public double getPerimeter(){
        return x.distance(y) + y.distance(z) + z.distance(x);
    }

    public boolean contains(MyPoint p){
        double bx = y.getX() - x.getX();
        double by = y.getY() - x.getY();
        double cx = z.getX() - x.getX();
        double cy = z.getY() - x.getY();
        double x1 = p.getX() - x.getX();
        double y1 = p.getY() - x.getY();

        double d = bx * cy - cx * by;
        double wa = (x1 * (by-cy) + y1 * (cx-bx) + bx * cy - cx * by) / d;
        double wb = (x1 * cy - y1 * cx) / d;
        double wc = (y1 * bx - x1 * by) / d;

        return ((0 < wa && wa < 1) && (0 < wb && wb < 1) && (0 < wc && wc < 1));
    }

    public boolean contains(Triangle2D triangle2D) {
        return (contains(triangle2D.getX()) && contains(triangle2D.getY()) && contains(triangle2D.getZ()));
    }

    public boolean overlaps(Triangle2D triangle2D) {
        return (contains(triangle2D.getX()) || contains(triangle2D.getY()) || contains(triangle2D.getZ()));
    }
}
