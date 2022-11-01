package Chapters.chapter_09;

public class Checkpoint_25D {
    public static void main(String[] args) {
        Te t1 = new Te();
        Te t2 = new Te();
        System.out.println("t1's i = " +
                t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " +
                t2.i + " and j = " + t2.j);
    }
}
    class Te {
    static int i = 0;
    int j = 0;
    Te() {
        i++;
        j = 1;
    }
}
