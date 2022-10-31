package Chapters.chapter_09;

public class Listing_07_TestCircleWithStaticMembers {
    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " +
                Listing_06_CircleWithStaticMembers.numberOfObjects);

        Listing_06_CircleWithStaticMembers c1 = new Listing_06_CircleWithStaticMembers();
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of the circle objects are " +
            c1.numberOfObjects);

        Listing_06_CircleWithStaticMembers c2 = new Listing_06_CircleWithStaticMembers(5);
        c1.radius = 9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" +
                 c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius +
                ") and number of Circle objects (" + c2.numberOfObjects + ")");

    }
}