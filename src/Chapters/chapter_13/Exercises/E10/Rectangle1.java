package Chapters.chapter_13.Exercises.E10;

import Chapters.chapter_13.Exercises.E09.Circle1;
import Chapters.chapter_13.Listings.GeometricObject;

public class Rectangle1 extends GeometricObject implements Comparable<Rectangle1> {
    private double height;
    private double width;

    public Rectangle1() {

    }

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle1(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle1 o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(getArea() == ((Rectangle1)o).getArea()){
            return true;
        }else
            return false;
    }
}
