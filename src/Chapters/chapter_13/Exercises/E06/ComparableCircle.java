package Chapters.chapter_13.Exercises.E06;


import Chapters.chapter_13.Listings.Circle;

public class ComparableCircle extends Circle implements Comparable<Circle>{

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
