package Chapters.chapter_06;

import java.util.Scanner;

public class C06E05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        displaySortedNumbers(a,b,c);
    }

    public static void displaySortedNumbers(double a, double b, double c) {
    double max = 2;
    double min =0;
    double med = 1;
    // 4,8,9
    if (a < b){
        max = b;
        min = a;
    } else {
        max = a;
        min = b;
    }
    if (max < c){
        med = max;
        max = c; // ma
    } else{
        if(min < c){
            med = c;  //
        } else {
            med = min;
            min = c;
        }
    }

        System.out.println("Numbers in ascending order are " + (int)min + ", " + (int)med + ", " + (int)max);
    }
}
