package Chapters.chapter_13.Exercises.E09;

import Chapters.chapter_13.Listings.GeometricObject;

public class Circle1 extends GeometricObject implements Comparable<Circle1> {
    private double radius;

    public Circle1() {

    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
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


    // Return the diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Print the circle info
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
    @Override
    public boolean equals(Object o) {
        if(getArea() == ((Circle1)o).getArea()){
            return true;
        }else
            return false;
    }

    @Override
    public int compareTo(Circle1 o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
