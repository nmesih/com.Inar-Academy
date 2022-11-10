package Chapters.chapter_10.Exercises.Exercise_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestQueue {
    public static void main(String[] args) {
        Queue que = new Queue();

        for (int i = 0; i <= 19; i++) {
            que.enqueue(i);
        }

        int size = que.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(que.dequeue() + " ");
        }
        System.out.println();
    }
}

