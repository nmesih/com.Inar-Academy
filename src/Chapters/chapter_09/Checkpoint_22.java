package Chapters.chapter_09;

public class Checkpoint_22 {
        private double radius = 1;
        /** Find the area of this circle */
        public double getArea() {
            return radius * radius * Math.PI;
        }
        public static void main(String[] args) {
            Checkpoint_22 myCircle = new Checkpoint_22();
            System.out.println("Radius is " + myCircle.radius);
        }
    }

