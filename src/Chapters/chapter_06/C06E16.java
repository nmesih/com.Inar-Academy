package Chapters.chapter_06;

public class C06E16 {
    public static void main(String[] args) {
        System.out.println("Number of days in a year (2000-2020): ");
        System.out.printf("%-9s%-9s" , "Year" , "Day");
        System.out.print("\n--------------");
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("\n%-9d%-9d", year, numberOfDaysInAYear(year));
        }

    }
    public static int numberOfDaysInAYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return 366;
        }else
            return 365;
    }
}
