package Chapters.Java_Set_Map_Exercises;

import java.util.*;

public class E01 {
    public static void main(String[] args) {
        /**(Analyze scores) Write a program that reads an unspecified number of scores and
         determines how many scores are above or equal to the average and how many
         scores are below the average. Enter a negative number to signify the end of the
         input. Assume that the maximum number of scores is 100.
        */

        List<Integer> list = getFromUser();
        double average = findAverage(list);
        int above = 0;
        int below = 0;

        System.out.print(Arrays.toString(list.toArray()));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < average){
                below++;
            }else
                above++;
        }
        System.out.println("\nAverage is " + average);
        System.out.println(below + " numbers are below average");
        System.out.println(above + " numbers are above or equal to the average");

    }

    private static double findAverage(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    private static List<Integer> getFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores (to finished enter negative number): ");
        int number = 1;
        while (number >= 0) {
            number = input.nextInt();
            if (number >= 0) {
                list.add(number);
            }
        }
        return list;

    }
}
