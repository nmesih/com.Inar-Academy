package Chapters.chapter_12.Exercises.Exercise_05;

public class Triangle1 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle1() throws IllegalTriangleException {
        this(1,1,1);
    }

    public Triangle1(double side1, double side2, double side3 ) throws IllegalTriangleException{
        if(side1 + side2 <= side3 || side2 + side3 <= side1 ||side1 + side3 <= side2) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        double x = (side1 + side2 + side3) / 2;
        return Math.sqrt(x * ((x - side1) * (x - side2) * (x - side3)));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }


    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

