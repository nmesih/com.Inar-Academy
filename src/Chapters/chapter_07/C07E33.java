package Chapters.chapter_07;

import java.util.Scanner;

public class C07E33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        chineseZodiac(year);
    }
    public static void chineseZodiac(int year){
        String[] yearName = {"monkey" , "rooster" , "dog" , "pig" , "rat" , "ox" , "tiger" , "rabbit" , "dragon" , "snake", "horse" , "sheep"};
        System.out.println(yearName[year % 12]);
    }

}
