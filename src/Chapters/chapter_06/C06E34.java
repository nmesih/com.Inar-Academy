package Chapters.chapter_06;

import java.util.Scanner;

public class C06E34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year (e.g. 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);

    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println("        " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


    public static int getNumberOfDaysInMonth(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }

    public static int getStartDay(int year, int month) {
        int j = (year / 100);
        int k = year % 100;
        if (month == 1 || month == 2) {
            month = month + 12;
            year = year - 1;
        }
        int h= (1 + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        switch (h) {

            case 0:
                h = 6;
                break;
            case 1:
                h = 7;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                h--;
        }

        return h;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; year++) {
            total += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 0; i < month; i++) {
            total += getNumberOfDaysInMonth(year, month);
        }

        return 0;
    }

    public static boolean isLeapYear(int year) {

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}

