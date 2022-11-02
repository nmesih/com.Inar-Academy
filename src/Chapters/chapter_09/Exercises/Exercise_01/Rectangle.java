package Chapters.chapter_09.Exercises.Exercise_01;

public class Rectangle {
    double width;
    double height;

    Rectangle(){
        double width = 1;
        double height = 1;
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width+height);

    }
}
