package Chapters.chapter_10.Exercises.Exercise_10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size] = value;
        size++;

    }

    public int dequeue() {
        for (int j = 0; j < size-1; j++) {
            elements[j] = elements[j+1];
        }
        size--;
        return elements[0];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

