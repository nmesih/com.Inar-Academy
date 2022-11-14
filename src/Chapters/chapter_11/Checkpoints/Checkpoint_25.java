package Chapters.chapter_11.Checkpoints;

import Chapters.chapter_11.Listings.CircleFromSimpleGeometricObject;
import Chapters.chapter_11.Listings.SimpleGeometricObject;

public class Checkpoint_25 {
    public static void main(String[] args) {

        System.out.println("Checkpoint_25");
    /*
    a. Assume are circle and object created as follows:
        Circle circle = new Circle(1);
        GeometricObject object = new GeometricObject();

    Are the following Boolean expressions true or false?
        (circle instanceof GeometricObject)      ---> true
        (object instanceof GeometricObject)     ---> true
        (circle instanceof Circle)      ---> true
        (object instanceof Circle)      ---> false
    b. Can the following statements be compiled?
        Circle circle = new Circle(5);
        GeometricObject object = circle;     ---> yes
    c. Can the following statements be compiled?
        GeometricObject object = new GeometricObject();
        Circle circle = (Circle)object --->  class cast exception
     */
        System.out.println("---------");
        System.out.println("Checkpoint_26");


        /*
        Assume that the following code is given:
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

         Answer the following questions:
        a. Is fruit instanceof Fruit?    yes
        b. Is fruit instanceof Orange?    no
        c. Is fruit instanceof Apple?    yes
        d. Is fruit instanceof GoldenDelicious?   yes
        e. Is fruit instanceof McIntosh?   no
        f. Is orange instanceof Orange?    yes
        g. Is orange instanceof Fruit?     yes
        h. Is orange instanceof Apple?     no
        i. Suppose the method makeAppleCider is defined in the Apple class. Can fruit
        invoke this method? Can orange invoke this method?    *fruit can invoke but orange can't.
        j. Suppose the method makeOrangeJuice is defined in the Orange class. Can
        orange invoke this method? Can fruit invoke this method?   *orange can invoke but fruit can't.
        k. Is the statement Orange p = new Apple() legal?   NO
        l. Is the statement McIntosh p = new Apple() legal?  NO
        m. Is the statement Apple p = new McIntosh() legal   YES

         */

    }
}