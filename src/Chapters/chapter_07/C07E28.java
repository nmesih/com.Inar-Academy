package Chapters.chapter_07;
//1- Kullanıcıdan bir dizi içinde olacak şekilde 10 int alacağız.
//2- Combinations isimli method oluşturacağız.
//3- Metodun içinde nested loop ile bütün kombinasyonları alıp içerdeki loop'un içinde çıktıyı vereceğiz.

import java.util.Scanner;

public class C07E28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[]array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        combinations(array);
    }

    public static void combinations(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("[" + array[i] + "][" + array[j] + "]  ");
                }
            System.out.println();
        }
        }
    }

