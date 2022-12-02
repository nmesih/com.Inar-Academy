package Chapters.chapter_13.Exercises.E07;

public class E_07 {
    public static void main(String[] args) {
        GeometricObject[] array = {new Square(5), new Square(7.5), new Square(0.5),
                new Square(33), new Square(10)};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of " + (i+1) +".Square: " +  array[i].getArea());
            System.out.print("How to color: ");
            ((Square) array[i]).howToColor();
            System.out.println();
        }
    }
}
