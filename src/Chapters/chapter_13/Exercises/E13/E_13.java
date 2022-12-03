package Chapters.chapter_13.Exercises.E13;

public class E_13 {
    public static void main(String[] args) {
        Course science = new Course("Science");
        science.addStudent("Ali");
        science.addStudent("Veli");
        science.addStudent("Hasan");
        science.addStudent("Merve");
        science.addStudent("Melis");
        System.out.println(science);
        System.out.println("--------------------");

        try {
            Course math = (Course)science.clone();
            System.out.println(math);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
