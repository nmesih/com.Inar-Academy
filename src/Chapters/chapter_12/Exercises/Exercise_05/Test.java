package Chapters.chapter_12.Exercises.Exercise_05;

public class Test {
    public static void main(String[] args) {

        try {
            Triangle1 t1 = new Triangle1(2,5,6);
            System.out.println("Triangle 1:\n" + t1);
            System.out.println("Triangle 2:");
            Triangle1 t2 = new Triangle1(3,3,6);
            System.out.println(t2);
        }catch (IllegalTriangleException ex){
            System.out.println(ex);
        }

        System.out.println("End of the program");
    }
}
