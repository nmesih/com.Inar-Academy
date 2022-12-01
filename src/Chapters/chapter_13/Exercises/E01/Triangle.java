package Chapters.chapter_13.Exercises.E01;

import Chapters.chapter_13.Listings.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this("white",false,1,1,1);
    }

    public Triangle(String color, boolean isFilled,int side1,int side2, int side3){
        super(color,isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea of triangle: " +this.getArea() + "\nPerimeter of triangle: " + this.getPerimeter();

    }

    @Override
    public double getArea() {
        double x = (side1 + side2 + side3) / 2;
        return Math.sqrt(x * ((x - side1) * (x - side2) * (x - side3)));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
