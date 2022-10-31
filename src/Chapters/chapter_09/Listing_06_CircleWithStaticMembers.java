package Chapters.chapter_09;

public class Listing_06_CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;


    Listing_06_CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    Listing_06_CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }


    double getArea() {
        return radius * radius * Math.PI;
    }
}
