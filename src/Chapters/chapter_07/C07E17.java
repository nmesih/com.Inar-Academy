package Chapters.chapter_07;
import java.util.Scanner;
// 1 - Kullanicidan ogrenci sayisini alacagiz. Bu bizim dizemizin uzunlugu olacak.
// 2 - Ogrencilerin isimleri ve notlarini alacagiz.
// 3 - Bu notlari buyukten kucuge siralayacagiz. Sorting yapacagiz.
// 4 - ogrenci adlarini, notlari buyukten kucuge olacak sekilde cikti olarak verecegiz.


public class C07E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        String[] students = new String[numberOfStudents];
        getScores(scores, students);
        sort(scores,students);
        display(students, scores);
    }

    public static void getScores(int[] scores, String[] students) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter the student name: ");
            students[i] = input.next();
            System.out.print("Enter the student score: ");
            scores[i] = input.nextInt();
        }
    }

    private static String[] sort(int[] scores, String[] students) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                    String stemp = students[i];
                    students[i] = students[j];
                    students[j] = stemp;
                }
            }
        }
        return students;
    }


    private static void display(String[] students, int[] scores) {
        System.out.println("Students in decreasing order of scores: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "-" + students[i] + ": " + scores[i]);
        }
    }

}
