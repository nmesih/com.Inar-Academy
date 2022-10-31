package Chapters.chapter_09;

public class Listing_10_TestPassObject {
    public static void main(String[] args) {

    Listing_08_CircleWithPrivateDataFields myCircle = new Listing_08_CircleWithPrivateDataFields(1);
    int n = 5;

    printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);


}

    private static void printAreas(Listing_08_CircleWithPrivateDataFields myCircle, int times) {
        System.out.println("Radius \t\tArea");

        while(times >= 1){
            System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
            myCircle.setRadius(myCircle.getRadius()+1);
            times--;
        }
    }
    }
