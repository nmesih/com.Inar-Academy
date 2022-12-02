package Chapters.chapter_13.Exercises.E05;

public class Circle extends GeometricObject1{
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override

    // Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the diameter
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    // Return perimeter
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

   // Print the circle info
    public String toString(){
        return "The circle of radius " + radius;
    }
}


