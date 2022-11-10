package Chapters.chapter_10.Exercises.Exercise_11;

public class Circle2D {
    //Two double data fields named x and y that specify the center of the circle
    //with getter methods.
    // ■ A data field radius with a getter method.
    // ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
    //for radius.
    // ■ A constructor that creates a circle with the specified x, y, and radius.
    // ■ A method getArea() that returns the area of the circle.
    // ■ A method getPerimeter() that returns the perimeter of the circle.
    // ■ A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle (see Figure 10.21a).
    // ■ A method contains(Circle2D circle) that returns true if the specified circle is inside this circle (see Figure 10.21b).
    // ■ A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle (see Figure 10.21c)

    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        this(0,0,1);
    }
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(getRadius(),2) * Math.PI;
    }
    public double getPerimeter(){
        return 2 * getRadius() * Math.PI;
    }
    public boolean contains(double x, double y){
        return distance(new Circle2D(x, y, 0)) <= getRadius();
    }
    public boolean contains(Circle2D circle){
        return distance(circle) + circle.getRadius() <= getRadius();
    }
    public boolean overlaps(Circle2D circle){
        return getRadius() + circle.getRadius() >= distance(circle);
    }
    public double distance(Circle2D circle){
        return Math.sqrt(Math.pow(getX() - circle.getX(), 2) + Math.pow(getY() - circle.getY(), 2));
    }

}
