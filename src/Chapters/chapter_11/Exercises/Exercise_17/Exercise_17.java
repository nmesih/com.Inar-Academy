package Chapters.chapter_11.Exercises.Exercise_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m:");
        int m = input.nextInt();

        ArrayList<Integer> list = getArrayList(m);

        int n = getN(list);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));

    }

    private static ArrayList<Integer> getArrayList(int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= m; i++) {
            if (m % i == 0) {
                list.add(i);
                m = m / i;
                i--;
            }
        }
        return list;
    }

    private static int getN(ArrayList<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count;

        for (int i = 0; i < list.size(); i++) {

            count = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                if (!arrayList.contains(list.get(i))) {
                    arrayList.add(list.get(i));
                }
            }
        }
        int n = 1;
        for (Integer integer : arrayList) {
            n *= integer;
        }

        return n;
    }
}