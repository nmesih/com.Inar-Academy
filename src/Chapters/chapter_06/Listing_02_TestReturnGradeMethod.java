package Chapters.chapter_06;

public class Listing_02_TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.print("The grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(59.5));
        }

    public static char getGrade(double a) {
        if(a >= 90){
            return 'A';
        } else if (a >= 80) {
            return 'B';
        } else if (a >= 70) {
            return 'C';
        }else if (a >= 60) {
            return 'D';
        }else
            return 'F';
    }
}
