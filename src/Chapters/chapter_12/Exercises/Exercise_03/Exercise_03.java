package Chapters.chapter_12.Exercises.Exercise_03;

import java.util.Scanner;

public class Exercise_03{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = createArray();

        try {
            System.out.println("Enter the index you want to view");
            int index = input.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid input. (Out of Bounds)");
            input.nextLine();
        }
    }

    private static int[] createArray() {
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

}
