package Chapters.chapter_11.Checkpoints;

public class Checkpoint_27 {
    public static void main(String[] args) {
        Object fruit = new Fruit();
        Object apple = (Apple) fruit;   //Class cast exception
    }
}

class Apple extends Fruit {
}

class Fruit {
}


