package Chapters.chapter_10.Exercises.Exercise_25;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and regex:");
        String str = input.next();
        String regex = input.next();
        displayArray(split(str,regex));

    }

    public static String[] split(String s, String regex){
        String[] arr = new String[s.length()];
        int arrIndex = 0;
        int substringBeginIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == regex.charAt(0)) || (s.charAt(i) == regex.charAt(1))){
                arr[arrIndex] = s.substring(substringBeginIndex,i);
                arr[arrIndex+1] = (s.charAt(i) == regex.charAt(0) ? regex.charAt(0) : regex.charAt(1)) + "";
                arrIndex += 2;
                substringBeginIndex = i+1;
            }
        }
        if(s.charAt(s.length()-1) != regex.charAt(0)){
            arr[arrIndex] = s.substring(substringBeginIndex);
        }
        return arr;
    }

    private static void displayArray(String[] split) {
        for (int i = 0; i < split.length; i++) {
            if(split[i] == null) {
                break;
            }
            System.out.print(split[i] + ",");
        }
    }
}
