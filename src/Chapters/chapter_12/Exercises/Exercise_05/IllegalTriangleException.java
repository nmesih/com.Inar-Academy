package Chapters.chapter_12.Exercises.Exercise_05;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(){
        super("Illegal triangle side! In a triangle, the sum of any two sides must be greater than the other side.");
    }
}
