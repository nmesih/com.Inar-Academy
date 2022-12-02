package Chapters.chapter_13.Exercises.E05;

public abstract class GeometricObject1 implements Comparable<GeometricObject1> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject1(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public boolean isFilled() {
        return filled;

    }

    public void setFilled(boolean filled) {
        this.filled = filled;

    }

    public java.util.Date getDateCreated() {
        return dateCreated;

    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject1 o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
