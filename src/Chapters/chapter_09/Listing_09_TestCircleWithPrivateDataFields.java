package Chapters.chapter_09;


public class Listing_09_TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        Listing_08_CircleWithPrivateDataFields c1 = new Listing_08_CircleWithPrivateDataFields(5);
        System.out.println("The area of the circle of radius " + c1.getRadius() +
                " is " + c1.getArea());

        c1.setRadius(c1.getRadius()* 1.1);
        System.out.println("The area of the circle of radius " + c1.getRadius() +
                " is " + c1.getArea());

        System.out.println("The number of objects created is " + Listing_08_CircleWithPrivateDataFields.getNumberOfObjects());
        
    }
}
