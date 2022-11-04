package Chapters.chapter_09.Exercises.Exercise_09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon triangle = new RegularPolygon();
        RegularPolygon hexagon = new RegularPolygon(6,4);
        RegularPolygon decagon = new RegularPolygon(10,4,5.6,7.8);

        System.out.printf("%20s%10s", "Perimeter" , "Area");
        System.out.printf("\nTriangle: %8.3f%12.1f", triangle.getArea(), triangle.getPerimeter());
        System.out.printf("\nHexagon : %8.3f%12.1f", hexagon.getArea(), hexagon.getPerimeter());
        System.out.printf("\nDecagon : %8.3f%12.1f", decagon.getArea(), decagon.getPerimeter());

    }
}
