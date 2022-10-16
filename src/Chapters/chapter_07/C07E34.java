package Chapters.chapter_07;

import java.util.Scanner;

public class C07E34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        String s1 = input.nextLine();
        System.out.println(s1);
        s1 = sort(s1);
        System.out.println(s1);
    }
    public static String sort(String s1){
        char[]array = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            array[i] = s1.charAt(i);
        }
        array = sort(array);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
    return result;
    }
    public static char[] sort(char[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
