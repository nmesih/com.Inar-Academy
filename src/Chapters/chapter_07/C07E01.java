package Chapters.chapter_07;

import java.util.Scanner;

public class C07E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents +" scores:");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        getMax(scores);

        char letterGrade = ' ';
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= getMax(scores) - 10){
                letterGrade = 'A';
            } else if(scores[i] >= getMax(scores) - 20){
                letterGrade = 'B';
            } else if (scores[i] >= getMax(scores) - 30) {
                letterGrade = 'C';
            } else if (scores[i] >= getMax(scores) - 40){
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + letterGrade);
        }
        }

    public static int getMax(int[] scores){
        int max = -1;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
}
