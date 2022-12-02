package Chapters.chapter_13.Exercises.E07;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.print(" Color all four sides");
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }
}
