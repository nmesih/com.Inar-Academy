package Chapters.chapter_07;

import java.util.Scanner;

public class C07E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[]numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor for entered numbers is " + gcd(numbers));
    }
    public static int gcd(int... numbers){
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd
        while (k <= numbers[0] && k <= numbers[1] && k <= numbers[2] && k <= numbers[3] && k <= numbers[4]) {
             if (numbers[0] % k == 0 && numbers[1] % k == 0 && numbers[2] % k == 0 && numbers[3] % k == 0 && numbers[4] % k == 0)
                 gcd = k; // Update gcd
                 k++;
             }
        return gcd;
    }
}
