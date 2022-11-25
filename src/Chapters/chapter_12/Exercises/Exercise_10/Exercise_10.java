package Chapters.chapter_12.Exercises.Exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        try {
            double[] array = new double[999999999*9999999];
            System.out.println("No error received");
        } catch (OutOfMemoryError ex){
            ex.printStackTrace();
            System.out.println("Out of memory!");
        }
        System.out.println("End of the program");
    }
}
