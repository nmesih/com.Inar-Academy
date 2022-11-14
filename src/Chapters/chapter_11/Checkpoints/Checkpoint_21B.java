package Chapters.chapter_11.Checkpoints;

public class Checkpoint_21B {
    public static void main(String[] args) {
        new Persons().printPersons();
        new Students().printPersons();
    }
}
class Students extends Persons {
    private String getInfo() {
        return "Student";
    }
}
class Persons {
    private String getInfo() {
        return "Person";
    }
    public void printPersons() {
        System.out.println(getInfo());
    }
}
