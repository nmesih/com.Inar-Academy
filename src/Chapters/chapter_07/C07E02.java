package Chapters.chapter_07;

public class C07E02 {
    public static void main(String[] args) {


        int[] number = {1, 8, 7, 35, 15, 67, 22, 95, 156, -5};
        int[] reversedNumber = reverseArray(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(reversedNumber[i] + " ");
        }
    }

    public static int[] reverseArray(int[] number) {
        int[] reversedNumber = new int[number.length];
        for (int i = 0, j = reversedNumber.length - 1; i < number.length; i++, j--) {
            reversedNumber[j] = number[i];
        }
        return reversedNumber;
    }
}
