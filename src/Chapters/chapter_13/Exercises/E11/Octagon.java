package Chapters.chapter_13.Exercises.E11;

import Chapters.chapter_13.Exercises.E08.MyStack;
import Chapters.chapter_13.Listings.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(){
    }

    public Octagon (double side){
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o){
        if(getArea() > o.getArea()){
            return 1;
        }else if(getArea() < o.getArea()){
            return -1;
        }else
            return 0;
    }

    @Override
    public Object clone() {
        try{
            Octagon octagon = (Octagon) super.clone();
            octagon.side = this.side;
            return octagon;
        }catch (CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("The area of octagon is %.2f \nThe perimeter of octagon is %.2f",getArea(),getPerimeter());
    }
}
