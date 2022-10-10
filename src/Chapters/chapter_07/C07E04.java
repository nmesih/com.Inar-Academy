package Chapters.chapter_07;

import java.util.Scanner;

public class C07E04 {
    public static void main(String[] args) {
        System.out.println("Enter the scores between 1 and 100:");
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        int number = 0;
        int sum = 0;

        while (true) {
            int i = input.nextInt();
            arr[number] = i;
            if (i < 0 || number == 100) {
                break;
            }
            sum += arr[number];
            number++;
        }
        double average = sum / number;
        int above = 0; // The number of elements above average
        int equal = 0; // The number of elements equal average
        int below = 0; // The number of elements below average
        for (int i = 0; i < number; i++)
            if (arr[i] > average) {
                above++;
            } else if (arr[i] == average){
                equal++;
            } else {
                below++;
            }
        System.out.println("Average is " + average);
        System.out.println("The number of scores equal to average is " + equal);
        System.out.println("The number of scores above average is " + above);
        System.out.println("The number of scores below average is " + below);
    }
}
