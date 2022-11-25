package Chapters.chapter_12.Exercises.Exercise_09;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter a binary number: ");
                String bin = input.nextLine();
                System.out.println("The decimal value for binary number "
                        + bin + " is " + binaryToDecimal(bin.toUpperCase()));
                continueInput = false;
            } catch (BinaryFormatException ex) {
                System.out.println(ex + "Try again!");
            }
        } while (continueInput) ;
        System.out.println("End of the program");
    }

    public static int binaryToDecimal(String binary) throws BinaryFormatException {
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Illegal binary value!");
            }
        }
        int result = 0;
        int n = binary.length()-1;
        int binaryValue;
        for (int i = 0; i < binary.length(); i++) {
            binaryValue = Integer.parseInt(binary.charAt(i) + "");
            int temp = binaryValue % 10;
            result += temp * Math.pow(2, n--);
            binaryValue = binaryValue/10;
        }
        return result;
    }

}
